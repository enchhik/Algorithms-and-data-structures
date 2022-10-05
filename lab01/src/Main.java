import java.util.*;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fill(arrayList, 100000, "arrayList");
        fill(linkedList, 100000, "linkedList");

        System.out.println();

        randomAccess(arrayList, "arrayList");
        randomAccess(linkedList, "linkedList");

        System.out.println();

        sequantialAccess(arrayList, "arrayList");
        sequantialAccess(linkedList, "linkedList");

        System.out.println();

        putIntoBegin(arrayList, 1000, "arrayList");
        putIntoBegin(linkedList, 1000, "linkedList");

        System.out.println();

        putIntoEnd(arrayList, 1000, "arrayList");
        putIntoEnd(linkedList, 1000, "linkedList");

        System.out.println();

        putIntoMiddle(arrayList, 1000, "arrayList");
        putIntoMiddle(linkedList, 1000, "linkedList");

    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
        list.add(i, rand.nextInt(count));
        }

        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            int index = rand.nextInt(list.size());
            list.get(index);
        }

        System.out.printf("Random Access in %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void sequantialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();

        for (Integer i : list)
            list.get(i);

        System.out.printf("Sequental Access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void putIntoBegin(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(i, rand.nextInt(count+1));
        }

        System.out.printf("Insert in the begin of %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void putIntoEnd(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(count+1));
        }

        System.out.printf("Insert in the end of %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void putIntoMiddle(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        int index = list.size()/2;
        for (int i = 0; i < count; i++) {
            list.add(index++, rand.nextInt(count+1));
        }

        System.out.printf("Insert in the middle of %s: %s%n", listType, System.currentTimeMillis() - time);
    }
}
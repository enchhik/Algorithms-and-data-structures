import java.util.*;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int countElem = 100000;
        int insertElem = 1000;

        String arrList = "arrayList";
        String linkList = "linkedList";

        fill(arrayList, countElem, arrList);
        fill(linkedList, countElem, linkList);

        System.out.println();

        randomAccess(arrayList, arrList);
        randomAccess(linkedList, linkList);

        System.out.println();

        sequentialAccess(arrayList, arrList);
        sequentialAccess(linkedList, linkList);

        System.out.println();

        putIntoBegin(arrayList, insertElem, arrList);
        putIntoBegin(linkedList, insertElem, linkList);

        System.out.println();

        putIntoEnd(arrayList, insertElem, arrList);
        putIntoEnd(linkedList, insertElem, linkList);

        System.out.println();

        putIntoMiddle(arrayList, insertElem, arrList);
        putIntoMiddle(linkedList, insertElem, linkList);

    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++)
            list.add(i, rand.nextInt(count));

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

    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();

        for (Integer i : list) {
            Integer s = i;
        }

        System.out.printf("Sequential Access %s: %s%n", listType, System.currentTimeMillis() - time);
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
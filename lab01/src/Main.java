import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        Random rand = new Random();
        for (int i = 0; i < count; i++) {
        list.set(i, rand.nextInt(count));
        }

        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        Random rand = new Random();
        int index = rand.nextInt(count);
        list.get(count);

        System.out.printf("Random Access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    //private static void sequantialAccess
}
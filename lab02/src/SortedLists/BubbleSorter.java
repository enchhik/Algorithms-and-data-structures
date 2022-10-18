package SortedLists;

import java.util.ArrayList;

public class BubbleSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < input.size() - 1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    temp = input.get(i);
                    input.set(i, input.get(i + 1));
                    input.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return input;
    }
}

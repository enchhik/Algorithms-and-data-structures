package SortedLists;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class QuickSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        quickSort(input, 0, input.size()-1);
        return input;
    }

    private void quickSort(ArrayList<Integer> input, int firstElem, int lastElem) {
        if (firstElem < lastElem) {
            int compareElem = divide(input, firstElem, lastElem);

            quickSort(input, firstElem, compareElem - 1);
            quickSort(input, compareElem, lastElem);
        }
    }

    private int divide(ArrayList<Integer> input, int firstElem, int lastElem) {
        int compareElem = input.get(firstElem);

        int left = firstElem;
        int right = lastElem;

        while (left <= right) {
            while (input.get(left) < compareElem) {
                left++;
            }
            while (input.get(right) > compareElem) {
                right--;
            }
            if (left <= right) {
                swap(input, right, left);
                left++;
                right--;
            }
        }
        return left;
    }
}

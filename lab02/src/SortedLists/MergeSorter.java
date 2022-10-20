package SortedLists;

import java.util.ArrayList;

public class MergeSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {

        divide(input, 0, input.size()-1);
        return input;
    }

    private void divide (ArrayList<Integer> input, int firstElem, int lastElem) {
        if (firstElem < lastElem && (lastElem - firstElem) >= 1) {
            int middle = (lastElem + firstElem) / 2;

            divide(input, firstElem, middle);
            divide(input, middle+1, lastElem);

            merger(input, firstElem, middle, lastElem);
        }
    }

    private void merger(ArrayList<Integer> input, int firstElem, int middle, int lastElem) {
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();

        int left = firstElem;
        int right = middle+1;

        while (left <= middle && right <= lastElem) {
            if (input.get(left) <= input.get(right)) {

                mergedSortedArray.add(input.get(left));
                left++;
            } else {

                mergedSortedArray.add(input.get(right));
                right++;
            }
        }

        while (left <= middle) {
            mergedSortedArray.add(input.get(left));
            left++;
        }
        while (right <= lastElem) {
            mergedSortedArray.add(input.get(right));
            right++;
        }

        int i = 0;
        int j = firstElem;

        while(i<mergedSortedArray.size()){
            input.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }

}

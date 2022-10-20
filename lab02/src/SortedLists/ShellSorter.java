package SortedLists;

import java.util.ArrayList;

public class ShellSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        int h = 1;

        while (h * 3 < input.size())
            h = h * 3 + 1;


        while (h >= 1) {
            hSort(input, h);
            h = h / 3;
        }

        return input;
    }

    private void hSort(ArrayList<Integer> arrayList, int h) {
        for (int i = h; i < arrayList.size(); i++) {
            for (int j = i; j >= h; j = j - h) {
                if (arrayList.get(j) < arrayList.get(j - h))
                    swap(arrayList, j, j - h);
                else
                    break;
            }
        }

    }

    private void swap (ArrayList<Integer> arrayList, int n, int m) {
        int temp;
        temp = arrayList.get(n);
        arrayList.set(n, arrayList.get(m));
        arrayList.set(m, temp);
    }
}

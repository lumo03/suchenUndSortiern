package test_sorting;

import sortieren.SelectionSort;
import java.util.Arrays;

public class TestSelectionSort {
    public static void testStatic() {
        int[] a = {5, 10, 15, 7, 3, 2, 9, 420, -73, -3000};
        int[] correct = {-3000, -73, 2, 3, 5, 7, 9, 10, 15, 420};

        SelectionSort sorter = new SelectionSort(a);
        sorter.sortieren();
        System.out.println(Arrays.equals(a, correct));
    }

    public static void main(String[] args) {
        testStatic();
    }
}

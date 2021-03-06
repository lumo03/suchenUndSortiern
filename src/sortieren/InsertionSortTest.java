package sortieren;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sortieren1() {

        int[] a = {5, 10, 15, 7, 3, 2, 9, 420, -73, -3000};
        int[] correctA = {-3000, -73, 2, 3, 5, 7, 9, 10, 15, 420};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.sortieren());
    }

    @Test
    void sortieren2() {

        int[] a = {-1000000000, -2000000000, -300000000, -500000000, -359555933, -290349444, -404004403, -343020200, -604943101};;
        int[] correctA = {-2000000000, -1000000000, -604943101, -500000000, -404004403, -359555933, -343020200, -300000000, -290349444};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.sortieren());
    }

    @Test
    void sortieren3() {

        int[] a = {2147483646, 2147483637, 2147483639, 2147483640, 2147483641, 2147483647, 2147483640, 2147483641};
        int[] correctA = {2147483637, 2147483639, 2147483640, 2147483640, 2147483641, 2147483641, 2147483646, 2147483647};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.sortieren());
    }

    @Test
    void sortieren4() {

        int[] a = {10};
        int[] correctA = {10};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.sortieren());
    }

    @Test
    void sortieren5() {

        int[] a = {80, 15, 33, 33, 90, 57, 57, 87, 43, 73, 34, 73, 64, 97, 89, 62, 78, 7, 78, 11, 55, 94, 34, 70, 31, 69, 75, 96, 40, 96, 40, 8, 1, 27, 34, 67, 47, 47, 32, 27, 46, 68, 1, 62, 54, 68, 56, 25, 45, 6, 89, 44, 104, 94, 58, 17, 24, 27, 48, 33, 43, 25, 31, 53, 36, 83, 51, 91, 51, 38, 70, 48, 95, 28, -1, 90, 64, 27, 88, 49, 40, 78, 75, 32, 66, 93, 90, 73, 87, 10, 5, 35, 14, 105, 36, 69, 61, 35, 82, 106, 41, 74, 1, 94, 33, 38, 94, 24, 25, 42, 20, 20, 24, 36, 49, 35, 26, 83, 20, 89, 24, 9, 56, 54, 43, 19, 14, 98, 32, 24, 72, 71, 27, 52, 41, 85, 48, 20, 67, 39, 50, 49, 89, 28, 52, 50, 75, 103, 44, 9, 5, 98, 45, 106, 67, 63, 20, 26, 1, 24, 51, 40, 31, 2, 53, 18, 100, 47};
        int[] correctA = {-1, 1, 1, 1, 1, 2, 5, 5, 6, 7, 8, 9, 9, 10, 11, 14, 14, 15, 17, 18, 19, 20, 20, 20, 20, 20, 24, 24, 24, 24, 24, 24, 25, 25, 25, 26, 26, 27, 27, 27, 27, 27, 28, 28, 31, 31, 31, 32, 32, 32, 33, 33, 33, 33, 34, 34, 34, 35, 35, 35, 36, 36, 36, 38, 38, 39, 40, 40, 40, 40, 41, 41, 42, 43, 43, 43, 44, 44, 45, 45, 46, 47, 47, 47, 48, 48, 48, 49, 49, 49, 50, 50, 51, 51, 51, 52, 52, 53, 53, 54, 54, 55, 56, 56, 57, 57, 58, 61, 62, 62, 63, 64, 64, 66, 67, 67, 67, 68, 68, 69, 69, 70, 70, 71, 72, 73, 73, 73, 74, 75, 75, 75, 78, 78, 78, 80, 82, 83, 83, 85, 87, 87, 88, 89, 89, 89, 89, 90, 90, 90, 91, 93, 94, 94, 94, 94, 95, 96, 96, 97, 98, 98, 100, 103, 104, 105, 106, 106};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.sortieren());
    }

    @Test
    void anderesSortieren1() {

        int[] a = {5, 10, 15, 7, 3, 2, 9, 420, -73, -3000};
        int[] correctA = {-3000, -73, 2, 3, 5, 7, 9, 10, 15, 420};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.anderesSortieren());
    }

    @Test
    void anderesSortieren2() {

        int[] a = {-1000000000, -2000000000, -300000000, -500000000, -359555933, -290349444, -404004403, -343020200, -604943101};;
        int[] correctA = {-2000000000, -1000000000, -604943101, -500000000, -404004403, -359555933, -343020200, -300000000, -290349444};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.anderesSortieren());
    }

    @Test
    void anderesSortieren3() {

        int[] a = {2147483646, 2147483637, 2147483639, 2147483640, 2147483641, 2147483647, 2147483640, 2147483641};
        int[] correctA = {2147483637, 2147483639, 2147483640, 2147483640, 2147483641, 2147483641, 2147483646, 2147483647};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.anderesSortieren());
    }

    @Test
    void anderesSortieren4() {

        int[] a = {10};
        int[] correctA = {10};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.anderesSortieren());
    }

    @Test
    void anderesSortieren5() {

        int[] a = {80, 15, 33, 33, 90, 57, 57, 87, 43, 73, 34, 73, 64, 97, 89, 62, 78, 7, 78, 11, 55, 94, 34, 70, 31, 69, 75, 96, 40, 96, 40, 8, 1, 27, 34, 67, 47, 47, 32, 27, 46, 68, 1, 62, 54, 68, 56, 25, 45, 6, 89, 44, 104, 94, 58, 17, 24, 27, 48, 33, 43, 25, 31, 53, 36, 83, 51, 91, 51, 38, 70, 48, 95, 28, -1, 90, 64, 27, 88, 49, 40, 78, 75, 32, 66, 93, 90, 73, 87, 10, 5, 35, 14, 105, 36, 69, 61, 35, 82, 106, 41, 74, 1, 94, 33, 38, 94, 24, 25, 42, 20, 20, 24, 36, 49, 35, 26, 83, 20, 89, 24, 9, 56, 54, 43, 19, 14, 98, 32, 24, 72, 71, 27, 52, 41, 85, 48, 20, 67, 39, 50, 49, 89, 28, 52, 50, 75, 103, 44, 9, 5, 98, 45, 106, 67, 63, 20, 26, 1, 24, 51, 40, 31, 2, 53, 18, 100, 47};
        int[] correctA = {-1, 1, 1, 1, 1, 2, 5, 5, 6, 7, 8, 9, 9, 10, 11, 14, 14, 15, 17, 18, 19, 20, 20, 20, 20, 20, 24, 24, 24, 24, 24, 24, 25, 25, 25, 26, 26, 27, 27, 27, 27, 27, 28, 28, 31, 31, 31, 32, 32, 32, 33, 33, 33, 33, 34, 34, 34, 35, 35, 35, 36, 36, 36, 38, 38, 39, 40, 40, 40, 40, 41, 41, 42, 43, 43, 43, 44, 44, 45, 45, 46, 47, 47, 47, 48, 48, 48, 49, 49, 49, 50, 50, 51, 51, 51, 52, 52, 53, 53, 54, 54, 55, 56, 56, 57, 57, 58, 61, 62, 62, 63, 64, 64, 66, 67, 67, 67, 68, 68, 69, 69, 70, 70, 71, 72, 73, 73, 73, 74, 75, 75, 75, 78, 78, 78, 80, 82, 83, 83, 85, 87, 87, 88, 89, 89, 89, 89, 90, 90, 90, 91, 93, 94, 94, 94, 94, 95, 96, 96, 97, 98, 98, 100, 103, 104, 105, 106, 106};

        InsertionSort InSort = new InsertionSort(a);

        assertArrayEquals(correctA, InSort.anderesSortieren());
    }
}
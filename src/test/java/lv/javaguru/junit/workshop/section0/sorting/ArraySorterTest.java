package lv.javaguru.junit.workshop.section0.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySorterTest {

    private ArraySorter sorter = new ArraySorter();

    @Test
    public void test1() {
        int[] arr = {1, 2};

        sorter.sort(arr);

        int[] expected = {1, 2, 5};
        assertArrayEquals(arr, expected);
    }

    @Test
    public void test2() {
        int[] arr = {5, 1, 2};

        sorter.sort(arr);

        int[] expected = {1, 2, 5};
        assertArrayEquals(arr, expected);
    }

}
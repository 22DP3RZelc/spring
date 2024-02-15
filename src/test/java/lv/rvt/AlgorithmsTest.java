package lv.rvt;

import rvt.Algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {
    
    @Test
    public void smallestTest()
    {
        int[] array = {1, 2, -1, -10, 5, 100};
        assertEquals(-10, Algorithms.smallest(array));
    }

    @Test
    public void indexOfSmallestTest()
    {
        int[] array = {1, 2, -1, -10, 5, 100, -2, 9, -100};
        assertEquals(8, Algorithms.indexOfSmallest(array));
    }

    @Test
    public void indexOfSmallestFromTest()
    {
        int[] array = {-1, 6, 9, 8, 12};
        assertEquals(0, Algorithms.indexOfSmallestFrom(array, 0));
        assertEquals(1, Algorithms.indexOfSmallestFrom(array, 1));
        assertEquals(3, Algorithms.indexOfSmallestFrom(array, 2));
    }

    @Test
    public void testBinarySearch()
    {
        int[] array = {-5, 1, 5, 7, 9, 19, 554};
        assertEquals(3, Algorithms.binarySearch(array, 7));   
    }
}

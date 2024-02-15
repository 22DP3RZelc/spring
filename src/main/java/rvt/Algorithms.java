package rvt;

import java.util.ArrayList;

public class Algorithms {
    public static int smallest(int[] array)
    {
        int minVal = array[0];
        for (int i: array) {
            if (minVal > i)
            {
                minVal = i;
            }
        }
        return minVal;
    }
    public static int indexOfSmallest(int[] array)
    {
        int minVal = array[0];
        int index = 0;
        for (int i = 0;  i < array.length; i++)
        {
            if (minVal > array[i])
            {
                index = i;
                minVal = array[i];
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex)
    {
        int minVal = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < (array.length-startIndex); i++)
        {
            if (minVal > array[i])
            {
                minVal = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int binarySearch(int[] array, int search)
    {
        // assuming the variable searched exits
        // assuming the variable list exits
        int begin = 0; // the 0th index of the list (i.e, the first index of the list)
        int end = array.length - 1; // the last index in the list
        int middle;

        while (begin <= end) {
            middle = (end + begin) / 2;

            if (search == array[middle]) {
                return middle;
            }

            if  (search < array[middle]) {
                begin = middle + 1;
            } else if (search < array[middle]) {
                end = middle - 1;
            }
        }
        return -1;
    }
}

package com.NepalCode.CyclicSort;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class CyclicSort {

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int checkCorrectIndex = arr[i] - 1;
            if (arr[i] != arr[checkCorrectIndex]) {
                swap(arr, i, checkCorrectIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String args[]) {
        
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}

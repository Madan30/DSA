package com.NepalCode.Array;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class Swap {

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    public static void main(String args[]) {
        int[] arr = {1, 3, 23, 9, 18};
        // swap(arr, 0, 1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

}

package com.NepalCode.SelectionSort;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class SelectionSorting {

    public static void main(String args[]) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int samllest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[samllest] > arr[j]) {
                    samllest = j;
                }
                int temp = arr[i];
                arr[i] = arr[samllest];
                arr[samllest] = temp;
            }
        }
    }

}

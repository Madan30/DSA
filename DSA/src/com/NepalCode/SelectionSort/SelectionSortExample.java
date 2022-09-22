package com.NepalCode.SelectionSort;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class SelectionSortExample {

    public static void main(String args[]) {
        int[] arr = {23, 12, 56, 78, 90};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        int min;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}

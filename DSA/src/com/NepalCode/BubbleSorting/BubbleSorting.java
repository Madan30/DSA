package com.NepalCode.BubbleSorting;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class BubbleSorting {

    public static void main(String args[]) {
        int[] arr = {2, 3, 1, 6, 4, 7, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}

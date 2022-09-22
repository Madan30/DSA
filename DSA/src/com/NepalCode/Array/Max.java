package com.NepalCode.Array;

/**
 *
 * @author mrg1813
 */
public class Max {

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }

    public static void main(String args[]) {
        int[] num = {22, 34, 54, 12, 76, 366};

       // System.out.println(max(num));

        System.out.println(maxRange(num, 1, 3));

    }

}

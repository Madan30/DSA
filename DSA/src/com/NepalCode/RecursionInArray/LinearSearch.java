package com.NepalCode.RecursionInArray;

/**
 *
 * @author mrg1813
 */
public class LinearSearch {

    public static void main(String args[]) {

    }

    static boolean linearSearch(int[] arr, int target, int index) {
        // base case
        if (arr.length == index) {
            return false;
        }

        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }

}

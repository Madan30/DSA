package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class BinarySearchRecursion {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // base case in recursion
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }

}

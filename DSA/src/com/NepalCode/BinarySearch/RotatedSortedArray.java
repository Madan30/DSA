package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class RotatedSortedArray {

    // Search in Rotated Sorted Array
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you didnot find the pivot, it nears the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, you have foudn 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {
            // find the middle element
            // int mid = start+end/2
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

    }

}

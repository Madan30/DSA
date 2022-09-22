package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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
        
        int[] nums = {2,3,4,16,15,18,12,19,-1,-12,56,78,90};
        int target = 56;
        int result = binarySearch(nums, target);
        
        System.out.println(result);

    }

}

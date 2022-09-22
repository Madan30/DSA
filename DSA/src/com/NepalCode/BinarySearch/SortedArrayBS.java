package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class SortedArrayBS {

    public static void main(String args[]) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int ans = search(arr, 9);

        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}

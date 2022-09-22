package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class FirstAndLastPosition {
    // find first and last position of elements in sorted array

    public int[] searcRange(int[] arr, int target) {

        int[] ans = {-1, -1};
        // check for first occurences if target first
//        int start = search(arr, target, true);
//        int end = search(arr, target, false);
//
//        ans[0] = start;
//        ans[1] = end;

        // other way to represent
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;

    }

    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int ans = search(nums, target, false);
        System.out.println(ans);

    }

}

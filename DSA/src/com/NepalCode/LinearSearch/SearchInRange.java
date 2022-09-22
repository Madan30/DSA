package com.NepalCode.LinearSearch;

/**
 *
 * @author mrg1813
 */
public class SearchInRange {

    static int linearSearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            // check for every element index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(nums, 1, 4, target));

    }

}

package com.NepalCode.LinearSearch;

/**
 *
 * @author mrg1813
 */
public class LinearSearchExmaple {

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }

        // this line will execute if none of the return statements above have executed
        // hence the target will not found
        return -1;
    }

    // search in the target  and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target will not found
        return Integer.MAX_VALUE;
    }

    // search in the target  and return the element
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target

            if (element == target) {
                return true;
            }

        }

        // this line will execute if none of the return statements above have executed
        // hence the target will not found
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 28;
        int ans = linearSearch(nums, 28);
        System.out.println(ans);

    }

}

package com.NepalCode.LinearSearch;

/**
 *
 * @author mrg1813
 */
public class FindMin {

    static int minNumber(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minValue = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < minValue) {
                minValue = arr[index];
            }
        }

        return minValue;

    }

    public static void main(String args[]) {

        int[] nums = {18, 12, -7, 3, 14, 28};
        System.out.println(minNumber(nums));

    }

}

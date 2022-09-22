package com.NepalCode.CyclicSort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrg1813
 */
public class DisappearedNumbers {

    // find all missing number in array --> google interview
    public List<Integer> missingNumberArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String args[]) {
        DisappearedNumbers ar = new DisappearedNumbers();
        int[] arr = {4, 0, 2, 1};
        ar.missingNumberArray(arr);

        System.out.println(ar.missingNumberArray(arr));

    }

}

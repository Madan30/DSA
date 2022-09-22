package com.NepalCode.RecursionInArray;

/**
 *
 * @author mrg1813
 */
public class SortedArray {

    // find if array is sorted or not
    static boolean sorted(int[] arr, int index) {
        // base conditions
        if (index == arr.length - 1) {
            return true;
        }
        
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
    
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 5, 7, 8};
        System.out.println(sorted(arr, 0));
        
    }
    
}

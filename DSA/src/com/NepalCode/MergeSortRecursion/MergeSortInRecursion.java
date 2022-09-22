package com.NepalCode.MergeSortRecursion;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class MergeSortInRecursion {
    
    public static void main(String args[]) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = megerSortRecursion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static int[] megerSortRecursion(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        
        int mid = arr.length / 2;
        int[] left = megerSortRecursion(Arrays.copyOfRange(arr, 0, mid));
        int[] right = megerSortRecursion(Arrays.copyOfRange(arr, mid, arr.length));
        
        return mergeSort(left, right);
        
    }
    
    private static int[] mergeSort(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
            
        }
        // it may be possible that one of the array is not complete
        // copy the remaining element
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    
}

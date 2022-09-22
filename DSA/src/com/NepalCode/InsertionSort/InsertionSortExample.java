package com.NepalCode.InsertionSort;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class InsertionSortExample {
    
    public static void main(String args[]) {
        int[] arr = {12, 34, 2, 56, 78, 4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int[] arr) {
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i]; // temp value will be 34
            j = i; // j=i --> j value will be 1
            
            while (j > 0 && arr[j - 1] > temp) {
                // arr[j-1] > temp --> arr[j-1] --> 1-1=0 >temp 34
                arr[j] = arr[j - 1];
                j = j - 1;
                
            }
            arr[j] = temp;
        }
    }
    
}

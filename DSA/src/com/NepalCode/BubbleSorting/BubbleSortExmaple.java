package com.NepalCode.BubbleSorting;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class BubbleSortExmaple {
    
    public static void main(String args[]) {
        int[] arr = {36, 19, 29, 12, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void bubbleSort(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            // arr.length = total length of element in array: ex arr={36,19,29,12,5}length = 5
            for (int j = 1; j < arr.length - i; j++) {
                // for(int j=0; j<arr.length-1-i; j++){
                  /*
                  if(arr[j]> arr[j+1]{
                    int temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp;
                }
                */
                  // }
                
                // arr.length-i = 5-0 = 5;
                if (arr[j] < arr[j - 1]) {
                    // arr[1] < arr[1-1] = arr[1]<arr[0]--> 19 < 36;
                    int temp = arr[j];
                    // storing arr[j] in temp: --> arr[19]

                    arr[j] = arr[j - 1];
                    // arr[19] = arr[36]

                    arr[j - 1] = temp;
                    // arr[36] = temp value is 19

                    isSwapped = true;
                }
                
            }
            if (!isSwapped) {
                break;
            }
            
        }
    }
    
}

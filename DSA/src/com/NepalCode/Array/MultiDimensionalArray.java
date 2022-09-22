package com.NepalCode.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class MultiDimensionalArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        /*
    1 2 3
    4 5 6
    7 8 9
         */
        // how we define it
        int[][] arr = new int[3][3];

//        // storing directly
//        int[][] arr1 = {
//            {1, 2, 3}, // 0 index
//            {4, 5, 6}, // 1st index
//            {7, 8, 9} // 2nd index
//        };

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();

            }

        }
        
//         // printing
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//
//               System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }
        
        // printing in another way
        for(int row = 0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        
        
         // printing in another way
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        
        
    }
}

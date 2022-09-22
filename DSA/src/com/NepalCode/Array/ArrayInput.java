package com.NepalCode.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class ArrayInput {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // array of primitives 
        int arr[] = new int[5];
        arr[0] = 41;
        arr[1] = 42;
        arr[2] = 44;
        arr[3] = 40;
        arr[4] = 46;
        
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
        
        System.out.println("****************************");
        System.out.println("using enhance for each loop");
        for (int num : arr) {
            System.out.println(num + " ");
        }

          System.out.println("****************************");
          System.out.println("Array of object");
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        // printing array using arrays.tostring method
        System.out.println(Arrays.toString(str));
        
        // printing array using for loop
        for(int i=0; i<str.length; i++){
            System.out.println(str[i] + " ");
        }
    }
    
}

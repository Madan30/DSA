package com.NepalCode.Array;

/**
 *
 * @author mrg1813
 */
public class Array {

    public static void main(String args[]) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Madan Ghale";

        // Q: sotre 5 roll numbers
        int roll1 = 20;
        int roll2 = 21;
        int roll3 = 34;
        int roll4 = 23;
        int roll5 = 12;

        // Q: if you have 100 roll number to sotre. 
        // it takes more time so this is not good parcticec
        // so we used array
        // syntax of array
        // datatype [] variable_name = new datatype[size];
        // store 5 roll number
        int[] rollno = new int[5];

        // or directly 
        int[] rollnos = {23, 21, 34, 56, 32, 45};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[4]; // initializaiton: actually here object is being created in the heap Memory
        
        
        String[] arr = new String[4];
        System.out.println(arr[0]);
    }

}

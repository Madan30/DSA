package com.NepalCode.Array;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class PrimeNumber {
    
    public static void main(String args[]) {
        int[] number = {24, 20, 17, 18, 19,13,11};
        primeNumber(number);
        System.out.println(Arrays.toString(number));
        
    }
    
    static void primeNumber(int[] num) {
        if (num.length == 0) {
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " " + "It is not prime number");
            } else {
                System.out.println(num[i] + " " + "It is  prime number");
            }
        }
        
    }
    
}

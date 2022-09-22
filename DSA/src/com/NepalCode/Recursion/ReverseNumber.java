package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class ReverseNumber {

    static int sum = 0;

    static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }

        int remainder = n % 10;
        sum = sum * 10 + remainder;
        reverseNumber(n / 10);

    }
    
    static int reverse2(int n){
        // sometimes you might need some additional variable in the arguments
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    
    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n/10, digits-1));
    }

    public static void main(String args[]) {

        reverseNumber(123456);
        System.out.println(sum);
        
        System.out.println("*******************************");

        System.out.println(reverse2(1234));
    }

}

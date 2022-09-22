package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class FibonocciNumber {

    public static void main(String args[]) {

        int ans = fiboNumber(4);
        System.out.println(ans);

    }

    static int fiboNumber(int n) {
        // base case in recursion 
        if (n < 2) {
            return n;
        }

        return fiboNumber(n - 1) + fiboNumber(n - 2);
    }

}

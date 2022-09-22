package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class CountDigit {

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int remain = n % 10;
        if (remain == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);

    }

    public static void main(String args[]) {
        
        int ans = count(23000100);
        System.out.println(ans);

    }

}

package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class DigitSum {

    public static void main(String args[]) {
        int ans = 1342;
        System.out.println(sum(ans));
        
        System.out.println("*********************************");
        
        int pro = 4563;
        System.out.println(digitProduct(pro));
    }
    
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        
        return (n % 10) + sum(n / 10);
    }
    
    static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        
        return (n % 10) * digitProduct(n / 10);
    }
    
}

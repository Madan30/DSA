package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class SimpleQuestion {
    
    public static void main(String args[]) {
        printNumber(5);
        
        System.out.println("*************************");
        printNumber1(5);
        
        System.out.println("*************************");
        mergerFun(5);
        
    }

    // print number from n to 1
    static void printNumber(int n) {

        // base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    // print number in reverse order
    static void printNumber1(int n) {
        
        if (n == 0) {
            return;
        }
        printNumber1(n - 1);
        System.out.println(n);
        
    }
    
    static void mergerFun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        mergerFun(n - 1);
        System.out.println(n);
    }
    
}

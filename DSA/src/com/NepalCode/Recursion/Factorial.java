
package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class Factorial {
    public static void main(String args[]){
        int ans = 5;
        System.out.println(factorial(ans));
        
    }
    
    static int factorial(int number){
        if(number<=1){
            return 1;
        }
        return number * factorial(number-1);
    }
    
    static int sum(int number){
        if(number<=1){
            return 1;
        }
        return number + sum(number-1);
    }
    
}

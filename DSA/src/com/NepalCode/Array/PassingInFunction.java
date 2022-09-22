
package com.NepalCode.Array;

/**
 *
 * @author mrg1813
 */
public class PassingInFunction {
    
    static void change(int[] arr){
        arr[0] = 99;
        
    }
    
    public static void main(String args[]){
        
        int nums [] = {1,2,3,4,5};
        change(nums);
        System.out.println(nums[0]);
        
    }
    
}

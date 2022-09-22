package com.NepalCode.ArraysQuestion;

import java.util.Arrays;

/**
 *
 * @author mrg1813
 */
public class SumofTwoNum {

    static int twoSumArray(int[] num, int target) {
        if (num.length == 0) {
            return -1;
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i - 1; j++) {
                if (num[i] + num[j] == target) {
                    return num[j];
                }
            }
        }
        return 0;
    }
    
//      static int[] twoSum(int[] nums, int target) {
//      
//        
//        for(int i=0; i<nums.length; i++){
//            for(int j= i+1; j<nums.length; j++){
//                if(nums[i]+ nums[j] ==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//        
//    }

    public static void main(String args[]) {
        int[] arr = {2, 7, 11, 15};
        int ans = twoSumArray(arr, 11);
        System.out.println(ans);

    }

}

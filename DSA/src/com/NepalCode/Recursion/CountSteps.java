package com.NepalCode.Recursion;

/**
 *
 * @author mrg1813
 */
public class CountSteps {

    public static void main(String args[]) {
        int ans = numberOfSteps(41);
        System.out.println(ans);

    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);

    }

}

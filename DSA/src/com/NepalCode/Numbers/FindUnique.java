package com.NepalCode.Numbers;

/**
 *
 * @author mrg1813
 */
public class FindUnique {

    public static void main(String args[]) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));

    }

    static int ans(int[] arr) {
        int uinque = 0;
        for (int n : arr) {
            uinque ^= n;
        }

        return uinque;
    }
}

package com.NepalCode.Function;

import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class SumOfNumber {

    public static void main(String args[]) {
       // sum();
        int ans = sum2();
        System.out.println(ans);

    }

    // without parameter and with no return type
    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

    // with return type and without parameter
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
    }

}

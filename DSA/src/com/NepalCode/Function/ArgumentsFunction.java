package com.NepalCode.Function;

import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class ArgumentsFunction {

    public static void main(String args[]) {
        int ans = sum(20, 12);
        System.out.println(ans);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = sc.next();
        String info = myGreet(name);
        System.out.println(info);
    }

    // with return type and argument
    static int sum(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    static String myGreet(String name) {
        String message = " Hello  " + name;
        return message;

    }

}

package com.NepalCode.Function;

/**
 *
 * @author mrg1813
 */
public class Swap {

    public static void main(String args[]) {
        int a = 20;
        int b = 10;
//
//        // swap 
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Ghlae";
        changeName(name);
        System.out.println(name);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void changeName(String name) {
        name = "Madan Ghale";
    }

}

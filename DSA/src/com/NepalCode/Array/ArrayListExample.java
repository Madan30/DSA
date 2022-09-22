package com.NepalCode.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class ArrayListExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(1);
//        list.add(31);
//        list.add(32);
//        list.add(45);
//        list.add(12);
//        list.add(90);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(12));
//
//        System.out.println(list.set(2, 30));

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        
        // output
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
    }

}

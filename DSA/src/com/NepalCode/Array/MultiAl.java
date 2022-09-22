/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NepalCode.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mrg1813
 */
public class MultiAl {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intializaiton
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
        
        list.stream().forEach(e -> System.out.println(e));
    }

}

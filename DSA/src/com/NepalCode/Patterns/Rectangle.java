package com.NepalCode.Patterns;

/**
 *
 * @author mrg1813
 */
public class Rectangle {

    public static void main(String args[]) {
        pattern1(4);

        System.out.println("***********************************");
        pattern2(4);

        System.out.println("***********************************");
        pattern3(4);

        System.out.println("***********************************");
        pattern4(5);
        
        System.out.println("***********************************");
        pattern5(5);

    }

    // pattern 1:
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }

    // pattern 2:
    static void pattern2(int n) {
        for (int row = n; row >= 0; row--) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }

    // pattern 3
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }

    // pattern 4
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }
    
    
      // pattern 5
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }

}

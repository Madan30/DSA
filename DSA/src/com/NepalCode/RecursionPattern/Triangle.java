package com.NepalCode.RecursionPattern;

/**
 *
 * @author mrg1813
 */
public class Triangle {
    
    public static void main(String args[]) {
        triangle(4, 0);
        triangle1(4, 0);
        
    }
    
    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }
    
    static void triangle1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            
            triangle1(row, col + 1);
            System.out.print("*");
        } else {
            
            triangle1(row - 1, 0);
            System.out.println();
        }
    }
    
}

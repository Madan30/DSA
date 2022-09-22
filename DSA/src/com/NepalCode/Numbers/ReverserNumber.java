package com.NepalCode.Numbers;

/**
 *
 * @author mrg1813
 */
public class ReverserNumber {

    public static void main(String args[]) {
        int ans = reverse(1234);
        System.out.println(ans);
    
    }

    static int reverse(int x) {
        int rev = 0;
       
        while(x!=0){
            int rem = x % 2;
            rev = rev * 10 + rem;
            x = x/10;
        }
        return 0;
    }

}

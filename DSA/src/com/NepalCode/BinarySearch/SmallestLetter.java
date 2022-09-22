package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class SmallestLetter {

    // find the smallest letter greater than target
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String args[]) {
        char[] ch = {'a', 'c', 'd', 'e', 'f', 'h', 'j'};
        char target = 'b';
        char ans = nextGreatestLetter(ch, 'b');
        
        System.out.println(ans);

    }

}

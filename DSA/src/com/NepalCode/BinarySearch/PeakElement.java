package com.NepalCode.BinarySearch;

/**
 *
 * @author mrg1813
 */
public class PeakElement {
    // find peak element in mountain array

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in desc part of array
                // this may be the ans, but look at left
                // this is why end ! = mid - 1
                end = mid;
            } else {
                // you are in asce part of array
                start = mid + 1; // because we know that mid - 1 element > mid element

            }
        }
        // in the end, start == end and poiting to the largest number because of the 2 chcecks
        // start and end are always trying to find max elements in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of  above line that is the best possible ans
        return start; // or return end as both are equal
    }

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

}

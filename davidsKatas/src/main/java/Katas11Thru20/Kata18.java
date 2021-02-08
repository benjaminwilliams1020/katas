package Katas11Thru20;

import static java.util.Arrays.sort;

public class Kata18 {

/*
Exercise 18: EvenlySpaced
Create a boolean method called EvenlySpaced that takes in three integers, “a”, “b”, and “c”;
Given three ints, a b c, one of them is small, one is medium and one is large. Return true
if the three values are evenly spaced, so the difference between small and medium is the same
as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

    public boolean evenlySpaced(int a, int b, int c) {
        int[] inputArray = {a, b, c};
        sort(inputArray, 0, inputArray.length);
        if((inputArray[2] - inputArray[1]) == (inputArray[1] - inputArray[0])) {
                return true;
        } else {
            return false;
        }
    }
}

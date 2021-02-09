package Katas21Thru30;

public class Kata22 {

/*
Exercise 22: ArrayFront9
Create a boolean method called ArrayFront9 that takes in an integer array “nums”.
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/

    public boolean arrayFront9(int[] nums) {
        boolean firstFourIsNine = false;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 9) && (i < 4)) {
                firstFourIsNine = true;
            }
        }
        return firstFourIsNine;
    }
}

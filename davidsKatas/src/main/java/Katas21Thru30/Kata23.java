package Katas21Thru30;

public class Kata23 {

/*
Exercise 23: ArrayCount9
Create an integer method called ArrayCount9 that takes in an
 integer array “nums”. Given an array of ints, return the
 number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/

    public int ArrayCount9(int[] nums) {
        int numberOfNines = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 9) {
                numberOfNines++;
            }
        }
        return numberOfNines;
    }
}

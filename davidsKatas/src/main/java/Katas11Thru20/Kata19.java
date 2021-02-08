package Katas11Thru20;

public class Kata19 {

/*
Exercise 19: Double23
Create a boolean method called Double23 that takes in an integer array “nums”.
Given an int array, return true if the array contains 2 twice, or 3 twice. The
array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */

    public boolean double23(int[] nums) {
        int doubleTwo = 0;
        int doubleThree = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                doubleTwo++;
            }
            if(nums[i] == 3) {
                doubleThree++;
            }
        }

        if((doubleTwo == 2) || (doubleThree == 2)) {
            return true;
        } else {
            return false;
        }
    }
}

package Katas01Thru10;

public class Kata09 {

/*
Exercise 9: No14
Create a boolean method called No14 that takes in an integer array “nums”.
Given an array of ints, return true if it contains no 1's and it contains no 4's.
no14([7, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → false
*/

    public boolean no14(int[] nums) {
        boolean containsNoOnesOrFours = true;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 1) || (nums[i]) == 4) {
                containsNoOnesOrFours = false;
            }
        }
        return containsNoOnesOrFours;
    }

}

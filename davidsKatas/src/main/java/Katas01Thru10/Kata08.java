package Katas01Thru10;

public class Kata08 {

/*
Exercise 8: No23
Create a method of type boolean called No23 that takes in an integer array “nums”.
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

    public boolean no23(int[] nums) {
        boolean hasNo2Or3 = true;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 2) || (nums[i] == 3)) {
                hasNo2Or3 = false;
            }
        }
        return hasNo2Or3;
    }

}

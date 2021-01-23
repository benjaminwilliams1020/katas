package Katas01Thru10;

public class Kata06 {

    /*
Exercise 6: Only14
Create a boolean method called Only14 that takes in an integer array “nums”.
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/

    public boolean only14(int[] nums) {
        boolean isOnlyOnesAndFours = false;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 1) || (nums[i] == 4)) {
                isOnlyOnesAndFours = true;
            } else {
                isOnlyOnesAndFours = false;
                return isOnlyOnesAndFours;
            }
        }
        return  isOnlyOnesAndFours;
    }
}


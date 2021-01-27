package Katas01Thru10;

public class Kata10 {

/*
Exercise 10: More14
Create a boolean method called More14 that takes in an array of type integer “nums”.
Given an array of ints, return true if the number of 1's is greater than the number
of 4's.

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/

    public boolean more14(int[] nums) {
        int numberOfOnes = 0;
        int numberOfFours = 0;
        boolean hasMoreOnesThanFours = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                numberOfOnes++;
            } else if(nums[i] == 4) {
                numberOfFours++;
            }
        }
        if(numberOfOnes > numberOfFours) {
            hasMoreOnesThanFours = true;
        }
        return hasMoreOnesThanFours;
    }

}

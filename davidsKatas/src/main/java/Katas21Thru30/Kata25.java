package Katas21Thru30;

public class Kata25 {

/*
Exercise 25: IsStrictlyIncreasing
Create a boolean method called IsStrictlyIncreasing that
takes in an integer array “nums”. Given an array of
integers, return true if the values are strictly increasing.
Return false otherwise

isStrictlyIncreasing([5,7,8,10]) → true
isStrictlyIncreasing([5,7,7,10]) → false
isStrictlyIncreasing([-5,-3,0,17]) → true
*/

    public boolean isStrictlyIncreasing(int[] nums) {
        boolean isIncreasing = true;
        int currentNumber = nums[0];
        int nextNumber = 0;
        for (int i = 1; i < nums.length; i++) {
            nextNumber = nums[i];
            if(currentNumber >= nextNumber) {
                isIncreasing = false;
            }
            currentNumber = nums[i];
        }
        return isIncreasing;
    }

}

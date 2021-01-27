package Katas11Thru20;

public class Kata11 {

/*
Exercise 11: MakeMiddle
Create an integer array method called MakeMiddle that takes in an integer array “nums”.
Given an array of ints of even length, return a new array length 2 containing the
middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 0, 6, 4, 9]) → [0, 6]
makeMiddle([1, 2]) → [1, 2]
*/

    public int[] makeMiddle(int[] nums) {
        int[] result = new int[2];
        int halfOfArray = (nums.length / 2) - 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[halfOfArray + i];
        }
        return result;
    }
}

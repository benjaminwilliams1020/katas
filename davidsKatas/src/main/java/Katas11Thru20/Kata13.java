package Katas11Thru20;

public class Kata13 {

/*
Exercise 13: MakeEnds
Create an integer array method called MakeEnds that takes in an
integer array “nums”. Given an array of ints, return a new array
length 2 containing the first and last elements from the original
array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/

    public int[] makeEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int[] resultArray = {first, last};
        return resultArray;

    }

}

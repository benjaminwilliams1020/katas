package Katas11Thru20;

public class Kata17 {

/*
Exercise 17: Fix23
Create an integer array called Fix23 that takes in an integer array
“nums”. Given an int array length 3, if there is a 2 in the array
immediately followed by a 3, set the 3 element to 0. Return the
changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/

    public int[] fix23(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 2) && (i < nums.length - 1)) {
                if(nums[i + 1] == 3) {
                    result[i] = nums[i];
                    result[i + 1] = 0;
                    i++;
                } else {
                    result[i] = nums[i];
                }
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }

}

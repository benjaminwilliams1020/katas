package Katas21Thru30;

public class Kata24 {

/*
Exercise 24: Array123
Create a boolean method called Array123 that takes in an
integer array “nums”. Given an array of ints, return true
if .. 1, 2, 3, .. appears in the array somewhere in order.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 3]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

    public boolean array123(int[] nums) {
        boolean has123 = false;
        int sequence = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                sequence = 1;
            }
            if(nums[i] == sequence) {
                if(sequence == 3) {
                    has123 = true;
                }
                sequence++;
            } else {
                sequence = 1;
            }
        }
        return has123;
    }
}

package Katas11Thru20;

public class Kata15 {

/*
Exercise 15: Has23
Create a boolean method called Has23 that takes in an integer array
“nums”. Given an int array length 2, return true if it contains a
2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
*/

    public boolean has23(int[] nums) {
        boolean hasTwoOrThree = false;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 2) || nums[i] == 3) {
                hasTwoOrThree = true;
            }
        }
        return hasTwoOrThree;
    }

}

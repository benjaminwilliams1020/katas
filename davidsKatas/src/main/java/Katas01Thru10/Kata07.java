package Katas01Thru10;

public class Kata07 {

        /*
Exercise 7: NoTriples
Create a boolean method called NoTuples that takes in an integer array “nums”.
Given an array of ints, we'll say that a triple is a value appearing 3 times
in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

    public boolean noTuples(int[] nums) {
        boolean hasNoTriple = true;
        int repeatCount = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[ i + 1 ]) {
                repeatCount++;
                if (repeatCount == 3) {
                    hasNoTriple = false;
                }
            } else {
                repeatCount = 1;
            }
        }
        return hasNoTriple;
    }
}

package Katas11Thru20;

public class Kata14 {

/*
Exercise 14: LessBy10
Create a boolean method called LessBy10 that take in three integers,
 “a, “b”, and “c”. Given three ints, a b c, return true if one of
them is 10 or more different than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
*/

    public boolean lessBy10(int a, int b, int c) {
        boolean moreThanTenDifferent = false;
        int[] results = {
                a - b,
                a - c,
                b - a,
                b - c,
                c - b,
                c - a
            };
        for (int i = 0; i < results.length; i++) {
            if(results[i] < 0) {
                results[i] = results[i] * -1;
            }
        }
        for (int i = 0; i < results.length; i++) {
            if(results[i] >= 10) {
                moreThanTenDifferent = true;
            }
        }
        return moreThanTenDifferent;
    }

}

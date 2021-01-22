package Katas01Thru10;

public class Kata04 {

        /*
Exercise 4: Start1
Create an integer method called Start1 that takes in two integer arrays "a" and "b".
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
*/

    public int start1(int[] a, int[] b) {
        int result = 5;
        if ((a.length == 0) && (b.length == 0)) {
            result = 0;
        } else if ((a.length == 0) || (b.length == 0)) {
            if ((a.length == 0) && (b[0] == 1)) {
                result = 1;
            } else if ((a[0] == 1) && (b.length == 0)) {
                result = 1;
            } else {
                result = 0;
            }
        } else if ((a[0] == 1) && (b[0] == 1)) {
            result = 2;
        } else if ((a[0] == 1) && (b[0] != 1)) {
            result = 1;
        } else if ((a[0] != 1) && (b[0] == 1)) {
            result = 1;
        } else if ((a[0] != 1) && (b[0] != 1)) {
            result = 0;
        } else {
            result = 10;
        }
        return result;
    }
}

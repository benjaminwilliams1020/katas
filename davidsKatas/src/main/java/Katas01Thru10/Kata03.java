package Katas01Thru10;

public class Kata03 {

        /*
Exercise 3: GreenTicket
Create an integer method called GreenTicket that takes in three integers, "a". "b", and "c"
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all
different from each other,  the result is 0. If all of the numbers are the same,
the result is 20. If two of the numbers are the same, the  result is 10.
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/

    public int greenTicket(int a, int b, int c) {
        int noneAreSame = 0;
        int twoAreSame = 10;
        int threeAreSame = 20;
        int result = 100;

        if((a == b) && (b == c)) {
            result = threeAreSame;
        } else if ((a == b) || (b == c) || (a == c)) {
            result = twoAreSame;
        } else {
            result = noneAreSame;
        }

        return result;
    }
}

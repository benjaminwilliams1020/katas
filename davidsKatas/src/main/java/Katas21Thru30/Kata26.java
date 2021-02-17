package Katas21Thru30;

public class Kata26 {

/*
Exercise 26: SumOdds
Create an integer method that takes in no arguments or parameters. Return the sum of the odd
integers between 1 and 100 inclusive.
sumOdds() →  2500
*/

    public int sumOdds() {
        int sumOfOdds = 0;
        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 != 0) {
                sumOfOdds = sumOfOdds + i;
            }
        }
        return sumOfOdds;
    }
}

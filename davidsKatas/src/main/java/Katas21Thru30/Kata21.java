package Katas21Thru30;

public class Kata21 {

/*
Exercise 21: Blackjack
Create an integer method called Blackjack that takes in two integers, “a” and “b”.
Given 2 int values greater than 0, return whichever value is nearest to 21 without
going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

    public static final int BLACK_JACK = 21;

    public int blackjack(int a, int b) {
        int result = 0;
        if((a > BLACK_JACK) && (b > BLACK_JACK)) {
            return result;
        } else if ((a > b) && (a <= BLACK_JACK)) {
            return a;
        } else if ((a > b) && (a > BLACK_JACK)) {
            return b;
        } else if ((b > a) && (b <= BLACK_JACK)) {
            return b;
        } else if ((b > a) && (b > BLACK_JACK)) {
            return a;
        } else {
            return 500;
        }
    }
}

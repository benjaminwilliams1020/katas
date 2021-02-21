package Katas21Thru30;

public class Kata27 {

/*
Exercise 27: SumOddsBetweenValues
Create an integer method that takes in two integer arguments
“start” and “end”. Return the sum of the odd integers between
“start” and “end” inclusive. “End” will not be less than
“start”.

sumOddsBetweenValues(0, 5) → 9
sumOddsBetweenValues(28,30) → 29
sumOddsBetweenValues(18, 18) → 0
*/

    public int sumOddsBetweenValues(int a, int b) {
        int sumOfOddValues = 0;
        for (int i = a; i <= b; i++) {
            if(i % 2 != 0) {
                sumOfOddValues = i + sumOfOddValues;
            }

        }
        return sumOfOddValues;
    }

}

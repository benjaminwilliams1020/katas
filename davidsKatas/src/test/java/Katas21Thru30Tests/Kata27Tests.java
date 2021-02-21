package Katas21Thru30Tests;

import Katas21Thru30.Kata27;
import org.junit.Assert;
import org.junit.Test;

public class Kata27Tests {

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

    Kata27 sut = new Kata27();

    @Test
    public void zero_five_sumIs9() {
        //Arrange
        int a = 0;
        int b = 5;
        int expectedResult = 9;

        //Act
        int actualResult = sut.sumOddsBetweenValues(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void twentyEight_thirty_sumIs29() {
        //Arrange
        int a = 28;
        int b = 30;
        int expectedResult = 29;

        //Act
        int actualResult = sut.sumOddsBetweenValues(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void eighteen_eighteen_sumIs0() {
        //Arrange
        int a = 18;
        int b = 18;
        int expectedResult = 0;

        //Act
        int actualResult = sut.sumOddsBetweenValues(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

}

package Katas21Thru30Tests;

import Katas21Thru30.Kata26;
import org.junit.Assert;
import org.junit.Test;

public class Kata26Tests {

/*
Exercise 26: SumOdds
Create an integer method that takes in no arguments or parameters. Return the sum of the odd
integers between 1 and 100 inclusive.
sumOdds() →  2500
*/

    Kata26 sut = new Kata26();

    @Test
    public void sum_odds_returns_2500() {
        //Arrange
        int expectedResult = 2500;

        //Act
        int actualResult = sut.sumOdds();

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

}

package Katas21Thru30Tests;

import Katas21Thru30.Kata21;
import org.junit.Assert;
import org.junit.Test;

public class Kata21Tests {

/*
Exercise 21: Blackjack
Create an integer method called Blackjack that takes in two integers, “a” and “b”.
Given 2 int values greater than 0, return whichever value is nearest to 21 without
going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

    Kata21 sut = new Kata21();

    @Test
    public void nineteen_twentyone_returns_twentyone() {
        //Arrange
        int a = 19;
        int b = 21;
        int expectedResult = 21;

        //Act
        int actualResult = sut.blackjack(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void twentyone_nineteen_returns_twentyone() {
        //Arrange
        int a = 21;
        int b = 19;
        int expectedResult = 21;

        //Act
        int actualResult = sut.blackjack(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void nineteen_twentytwo_returns_nineteen() {
        //Arrange
        int a = 19;
        int b = 22;
        int expectedResult = 19;

        //Act
        int actualResult = sut.blackjack(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void one_nine_returns_nine() {
        //Arrange
        int a = 1;
        int b = 9;
        int expectedResult = 9;

        //Act
        int actualResult = sut.blackjack(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void twentytwo_twentynine_returns_zero() {
        //Arrange
        int a = 22;
        int b = 29;
        int expectedResult = 0;

        //Act
        int actualResult = sut.blackjack(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

}

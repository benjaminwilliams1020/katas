package Katas21Thru30Tests;

import Katas21Thru30.Kata23;
import org.junit.Assert;
import org.junit.Test;

public class Kata23Tests {

/*
Exercise 23: ArrayCount9
Create an integer method called ArrayCount9 that takes in an
 integer array “nums”. Given an array of ints, return the
 number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/

    Kata23 sut = new Kata23();

    @Test
    public void had_one_9_returns_1() {
        //Arrange
        int[] testArray = {1, 2, 9};
        int expectedResult = 1;

        //Act
        int actualResult = sut.ArrayCount9(testArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void had_two_9_returns_2() {
        //Arrange
        int[] testArray = {1, 9, 9};
        int expectedResult = 2;

        //Act
        int actualResult = sut.ArrayCount9(testArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void had_three_9_returns_3() {
        //Arrange
        int[] testArray = {1, 9, 9, 3, 9};
        int expectedResult = 3;

        //Act
        int actualResult = sut.ArrayCount9(testArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void had_zero_9_returns_0() {
        //Arrange
        int[] testArray = {1, 2, 3};
        int expectedResult = 0;

        //Act
        int actualResult = sut.ArrayCount9(testArray);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

}

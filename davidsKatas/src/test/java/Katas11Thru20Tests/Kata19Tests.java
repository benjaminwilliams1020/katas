package Katas11Thru20Tests;

import Katas11Thru20.Kata19;
import org.junit.Assert;
import org.junit.Test;

public class Kata19Tests {

/*
Exercise 19: Double23
Create a boolean method called Double23 that takes in an integer array “nums”.
Given an int array, return true if the array contains 2 twice, or 3 twice. The
array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */

    Kata19 sut = new Kata19();

    @Test
    public void double_two_returns_true() {
        //Arrange
        int[] testArray = {2, 2};

        //Act
        boolean result = sut.double23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void double_three_returns_true() {
        //Arrange
        int[] testArray = {3, 3};

        //Act
        boolean result = sut.double23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void no_double_returns_false() {
        //Arrange
        int[] testArray = {2, 3};

        //Act
        boolean result = sut.double23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_length_one_returns_false() {
        //Arrange
        int[] testArray = {2};

        //Act
        boolean result = sut.double23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_length_zero_returns_false() {
        //Arrange
        int[] testArray = {};

        //Act
        boolean result = sut.double23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

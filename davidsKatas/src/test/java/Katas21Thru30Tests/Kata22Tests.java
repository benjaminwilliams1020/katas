package Katas21Thru30Tests;

import Katas21Thru30.Kata22;
import org.junit.Assert;
import org.junit.Test;

public class Kata22Tests {

/*
Exercise 22: ArrayFront9
Create a boolean method called ArrayFront9 that takes in an integer array “nums”.
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/

    Kata22 sut = new Kata22();

    @Test
    public void array_has_9_at_index_3_returns_true() {
        //Arrange
        int[] testArray = {1, 2, 9, 3, 4};

        //Act
        boolean result = sut.arrayFront9(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_has_no_9_version_1_returns_false() {
        //Arrange
        int[] testArray = {1, 2, 3, 4, 9};

        //Act
        boolean result = sut.arrayFront9(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_has_no_9_version_2_returns_false() {
        //Arrange
        int[] testArray = {1, 2, 3, 4, 5};

        //Act
        boolean result = sut.arrayFront9(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_has_9_at_index_1_returns_true() {
        //Arrange
        int[] testArray = {9, 2};

        //Act
        boolean result = sut.arrayFront9(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_has_no_9_version_3_returns_false() {
        //Arrange
        int[] testArray = {1, 2};

        //Act
        boolean result = sut.arrayFront9(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

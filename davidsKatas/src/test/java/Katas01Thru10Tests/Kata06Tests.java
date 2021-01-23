package Katas01Thru10Tests;

import Katas01Thru10.Kata06;
import org.junit.Assert;
import org.junit.Test;

public class Kata06Tests {

        /*
Exercise 6: Only14
Create a boolean method called Only14 that takes in an integer array “nums”.
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/

    Kata06 sut = new Kata06();

    @Test
    public void array_contains_ones_and_fours_returns_true() {
        //Arrange
        int[] testArray = {1, 4, 1, 4};

        //Act
        boolean result = sut.only14(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_does_not_contain_only_ones_and_fours_returns_false() {
        //Arrange
        int[] testArray = {1, 4, 2, 4};

        //Act
        boolean result = sut.only14(testArray);

        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void array_contains_only_ones_returns_true() {
        //Arrange
        int[] testArray = {1, 1, 1, 1};

        //Act
        boolean result = sut.only14(testArray);

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_contains_only_fours_returns_true() {
        //Arrange
        int[] testArray = {4, 4, 4, 4};

        //Act
        boolean result = sut.only14(testArray);

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_is_empty_returns_false() {
        //Arrange
        int[] testArray = {};

        //Act
        boolean result = sut.only14(testArray);

        //Assert
        Assert.assertFalse(result);
    }

}

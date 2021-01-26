package Katas01Thru10Tests;

import Katas01Thru10.Kata09;
import org.junit.Assert;
import org.junit.Test;

public class Kata09Tests {

/*
Exercise 9: No14
Create a boolean method called No14 that takes in an integer array “nums”.
Given an array of ints, return true if it contains no 1's and it contains no 4's.
no14([7, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → false
*/

    Kata09 sut = new Kata09();

    @Test
    public void has_no_ones_or_fours_returns_true() {
        //Arrange
        int[] testArray = {7, 2, 3};

        //Act
        boolean result = sut.no14(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void has_one_and_four_returns_false() {
        //Arrange
        int[] testArray = {1, 2, 3, 4};

        //Act
        boolean result = sut.no14(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void has_no_one_but_has_four_returns_false() {
        //Arrange
        int[] testArray = {2, 3, 4};

        //Act
        boolean result = sut.no14(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void has_one_but_has_no_four_returns_false() {
        //Arrange
        int[] testArray = {2, 1, 9};

        //Act
        boolean result = sut.no14(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

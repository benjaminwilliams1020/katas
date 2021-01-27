package Katas01Thru10Tests;

import Katas01Thru10.Kata10;
import org.junit.Assert;
import org.junit.Test;

public class Kata10Tests {

/*
Exercise 10: More14
Create a boolean method called More14 that takes in an array of type integer “nums”.
Given an array of ints, return true if the number of 1's is greater than the number
of 4's.

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/

    Kata10 sut = new Kata10();

    @Test
    public void more_ones_than_fours_returns_true() {
        //Arrange
        int[] testArray = {1, 4, 1};

        //Act
        boolean result = sut.more14(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void same_number_of_ones_and_fours_returns_false() {
        //Arrange
        int[] testArray = {1, 4, 1, 4};

        //Act
        boolean result = sut.more14(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void only_ones_and_no_fours_returns_true() {
        //Arrange
        int[] testArray = {1, 1};

        //Act
        boolean result = sut.more14(testArray);

        //Assert
        Assert.assertTrue(result);

    }

}

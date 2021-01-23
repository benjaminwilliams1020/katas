package Katas01Thru10Tests;

import Katas01Thru10.Kata08;
import org.junit.Assert;
import org.junit.Test;

public class Kata08Tests {

/*
Exercise 8: No23
Create a method of type boolean called No23 that takes in an integer array “nums”.
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

    Kata08 sut = new Kata08();

    @Test
    public void array_of_4_and_5_returns_true() {
        //Arrange
        int[] testArray = {4, 5};

        //Act
        boolean result = sut.no23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_of_4_and_2_returns_false() {
        //Arrange
        int[] testArray = {4, 2};

        //Act
        boolean result = sut.no23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_of_3_and_5_returns_false() {
        //Arrange
        int[] testArray = {3, 5};

        //Act
        boolean result = sut.no23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

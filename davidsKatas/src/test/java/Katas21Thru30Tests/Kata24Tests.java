package Katas21Thru30Tests;

import Katas21Thru30.Kata24;
import org.junit.Assert;
import org.junit.Test;

public class Kata24Tests {

/*
Exercise 24: Array123
Create a boolean method called Array123 that takes in an
integer array “nums”. Given an array of ints, return true
if .. 1, 2, 3, .. appears in the array somewhere in order.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 3]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

    Kata24 sut = new Kata24();

    @Test
    public void array_has_123_v1_returns_true() {
        //Arrange
        int[] testArray = {1, 1, 2, 3, 1};

        //Act
        boolean result = sut.array123(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_has_123_v2_returns_true() {
        //Arrange
        int[] testArray = {1, 1, 2, 1, 2, 3};

        //Act
        boolean result = sut.array123(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_has_no_123_v1_returns_false() {
        //Arrange
        int[] testArray = {1, 1, 2, 4, 3};

        //Act
        boolean result = sut.array123(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

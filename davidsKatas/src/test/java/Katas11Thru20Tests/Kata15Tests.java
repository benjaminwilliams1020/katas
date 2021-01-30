package Katas11Thru20Tests;

import Katas11Thru20.Kata15;
import org.junit.Assert;
import org.junit.Test;

public class Kata15Tests {

/*
Exercise 15: Has23
Create a boolean method called Has23 that takes in an integer array
“nums”. Given an int array length 2, return true if it contains a
2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
*/

    Kata15 sut = new Kata15();

    @Test
    public void array_contains_two() {
        //Arrange
        int[] testArray = {2, 5};

        //Act
        boolean result = sut.has23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_contains_three() {
        //Arrange
        int[] testArray = {4, 3};

        //Act
        boolean result = sut.has23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void array_contains_neither() {
        //Arrange
        int[] testArray = {4, 5};

        //Act
        boolean result = sut.has23(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void array_contains_two_and_three() {
        //Arrange
        int[] testArray = {2, 3};

        //Act
        boolean result = sut.has23(testArray);

        //Assert
        Assert.assertTrue(result);

    }

}

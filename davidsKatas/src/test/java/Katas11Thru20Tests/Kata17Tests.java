package Katas11Thru20Tests;

import Katas11Thru20.Kata17;
import org.junit.Assert;
import org.junit.Test;

public class Kata17Tests {

/*
Exercise 17: Fix23
Create an integer array called Fix23 that takes in an integer array
“nums”. Given an int array length 3, if there is a 2 in the array
immediately followed by a 3, set the 3 element to 0. Return the
changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/

    Kata17 sut = new Kata17();

    @Test
    public void has_two_followed_by_three_v1() {
        //Arrange
        int[] testArray = {1, 2, 3};
        int[] expectedResult = {1, 2, 0};

        //Act
        int[] actualResult = sut.fix23(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void has_two_followed_by_three_v2() {
        //Arrange
        int[] testArray = {2, 3, 5};
        int[] expectedResult = {2, 0, 5};

        //Act
        int[] actualResult = sut.fix23(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void two_not_followed_by_three_v1() {
        //Arrange
        int[] testArray = {1, 2, 1};
        int[] expectedResult = {1, 2, 1};

        //Act
        int[] actualResult = sut.fix23(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void two_not_followed_by_three_v2() {
        //Arrange
        int[] testArray = {2, 5, 3};
        int[] expectedResult = {2, 5, 3};

        //Act
        int[] actualResult = sut.fix23(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void two_not_followed_by_three_v3() {
        //Arrange
        int[] testArray = {2, 2, 2};
        int[] expectedResult = {2, 2, 2};

        //Act
        int[] actualResult = sut.fix23(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

}

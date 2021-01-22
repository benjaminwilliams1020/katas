package Katas01Thru10Tests;

import Katas01Thru10.Kata02;
import org.junit.Assert;
import org.junit.Test;

public class Kata02Tests {
        /*
Exercise 2: Has12
Create a boolean method called Has12 that takes in an integer array "nums".
Given an array of ints, return true if there is a 1 in the array
with a 2 somewhere later in the array.
For example:
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/

    @Test
    public void test_01_true() {
        //Arrange
        Kata02 sut = new Kata02();
        int[] testArray = new int[] {1, 3, 2};

        //Act
        boolean result = sut.has12(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void test_02_true() {
        //Arrange
        Kata02 sut = new Kata02();
        int[] testArray = new int[] {3, 1, 2};

        //Act
        boolean result = sut.has12(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void test_03_true() {
        //Arrange
        Kata02 sut = new Kata02();
        int[] testArray = new int[] {3, 1, 4, 5, 2};

        //Act
        boolean result = sut.has12(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void test_04_false() {
        //Arrange
        Kata02 sut = new Kata02();
        int[] testArray = new int[] {3, 1, 4, 5, 0};

        //Act
        boolean result = sut.has12(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void test_05_false() {
        //Arrange
        Kata02 sut = new Kata02();
        int[] testArray = new int[] {2, 1, 4, 5, 0};

        //Act
        boolean result = sut.has12(testArray);

        //Assert
        Assert.assertFalse(result);

    }

//    has12([1, 3, 2]) → true
//    has12([3, 1, 2]) → true
//    has12([3, 1, 4, 5, 2]) → true
}

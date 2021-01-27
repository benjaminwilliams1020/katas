package Katas11Thru20Tests;

import Katas11Thru20.Kata11;
import org.junit.Assert;
import org.junit.Test;

public class Kata11Tests {

/*
Exercise 11: MakeMiddle
Create an integer array method called MakeMiddle that takes in an integer array “nums”.
Given an array of ints of even length, return a new array length 2 containing the
middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

    Kata11 sut = new Kata11();

    @Test
    public void middle_numbers_2_and_3() {
        //Arrange
        int[] testArray = {1, 2, 3, 4};
        int[] expectedArray = {2, 3};

        //Act
        int[] resultArray = sut.makeMiddle(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

    @Test
    public void middle_numbers_0_and_6() {
        //Arrange
        int[] testArray = {7, 1, 0, 6, 4, 9};
        int[] expectedArray = {0, 6};

        //Act
        int[] resultArray = sut.makeMiddle(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

    @Test
    public void middle_numbers_1_and_2() {
        //Arrange
        int[] testArray = {1, 2};
        int[] expectedArray = {1, 2};

        //Act
        int[] resultArray = sut.makeMiddle(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray,resultArray);

    }

}

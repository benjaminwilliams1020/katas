package Katas11Thru20Tests;

import Katas11Thru20.Kata12;
import org.junit.Assert;
import org.junit.Test;

public class Kata12Tests {

/*
Exercise 12: MakeLast
Create an integer array method called MakeLast that takes in an
integer array “nums”. Given an int array, return a new array with
double the length where its last element is the same as the
original array, and all the other elements are 0. The original
array will be length 1 or more. Note: by default, a new int array
contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/

    Kata12 sut = new Kata12();

    @Test
    public void array_length_3_returns_length_6_final_num_6() {
        //Arrange
        int[] testArray = {4, 5, 6};
        int[] expectedArray = {0, 0, 0, 0, 0, 6};

        //Act
        int[] resultArray = sut.makeLast(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void array_length_2_returns_length_4_final_num_2() {
        //Arrange
        int[] testArray = {1, 2};
        int[] expectedArray = {0, 0, 0, 2};

        //Act
        int[] resultArray = sut.makeLast(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void array_length_1_returns_length_2_final_num_3() {
        //Arrange
        int[] testArray = {3};
        int[] expectedArray = {0, 3};

        //Act
        int[] resultArray = sut.makeLast(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

}

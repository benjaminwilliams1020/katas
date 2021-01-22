package Katas01Thru10Tests;

import Katas01Thru10.Kata01;
import org.junit.Assert;
import org.junit.Test;

public class Kata01Tests {
        /*
Exercise 1: SwapEnds
Create an integer array method called SwapEnds that takes in an integer array "nums".
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.
For example:
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/

    @Test
    public void one_moves_to_end_of_array() {
        //Arrange
        Kata01 sut = new Kata01();
        int[] testArray = new int[] {1, 2, 3, 4};
        int[] expectedResult = new int[] {4, 2, 3, 1};

        //Act
        int[] result = sut.swapEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void one_moves_to_end_again_of_array() {
        //Arrange
        Kata01 sut = new Kata01();
        int[] testArray = new int[] {1, 2, 3};
        int[] expectedResult = new int[] {3, 2, 1};

        //Act
        int[] result = sut.swapEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void eight_moves_to_end_of_array() {
        //Arrange
        Kata01 sut = new Kata01();
        int[] testArray = new int[] {8, 6, 7, 9, 5};
        int[] expectedResult = new int[] {5, 6, 7, 9, 8};

        //Act
        int[] result = sut.swapEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedResult, result);
    }

}

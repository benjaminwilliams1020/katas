package Katas11Thru20Tests;

import Katas11Thru20.Kata13;
import org.junit.Assert;
import org.junit.Test;

public class Kata13Tests {

/*
Exercise 13: MakeEnds
Create an integer array method called MakeEnds that takes in an
integer array “nums”. Given an array of ints, return a new array
length 2 containing the first and last elements from the original
array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/

    Kata13 sut = new Kata13();

    @Test
    public void make_ends_one_and_three() {
        //Arrange
        int[] testArray = {1, 2, 3};
        int[] expectedArray = {1, 3};

        //Act
        int[] result = sut.makeEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, result);

    }

    @Test
    public void make_ends_one_and_four() {
        //Arrange
        int[] testArray = {1, 2, 3, 4};
        int[] expectedArray = {1, 4};

        //Act
        int[] result = sut.makeEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, result);

    }

    @Test
    public void make_ends_seven_and_two() {
        //Arrange
        int[] testArray = {7, 4, 6, 2};
        int[] expectedArray = {7, 2};

        //Act
        int[] result = sut.makeEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, result);

    }

    @Test
    public void make_ends_one_and_one() {
        //Arrange
        int[] testArray = {1};
        int[] expectedArray = {1, 1};

        //Act
        int[] result = sut.makeEnds(testArray);

        //Assert
        Assert.assertArrayEquals(expectedArray, result);

    }

}

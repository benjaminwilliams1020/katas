package Katas01Thru10Tests;

import Katas01Thru10.Kata05;
import org.junit.Assert;
import org.junit.Test;

public class Kata05Tests {
        /*
Exercise 5: FizzArray3
Create an integer array method called FizzArray3  that takes in two
integers "start" and "end". Given start and end numbers, return a new
array containing the sequence of integers from start up to but  not
including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end
number will be greater or equal  to the start number. Note that a length-0 array is valid.

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
*/

    Kata05 sut = new Kata05();

    @Test
    public void input_5_and_10_array_returned_length_5() {
        //Arrange
        int a = 5;
        int b = 10;
        int[] expectedResult = new int[] {5, 6, 7, 8, 9};

        //Act
        int[] actualResult = sut.fizzArray3(a, b);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void input_11_and_18_array_returned_length_7() {
        //Arrange
        int a =11;
        int b = 18;
        int[] expectedResult = new int[] {11, 12, 13, 14, 15, 16, 17};

        //Act
        int[] actualResult = sut.fizzArray3(a, b);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void input_1_and_3_array_returned_length_1() {
        //Arrange
        int a = 1;
        int b = 3;
        int[] expectedResult = new int[] {1, 2};

        //Act
        int[] actualResult = sut.fizzArray3(a, b);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void input_20_and_20_array_returned_length_0() {
        //Arrange
        int a = 20;
        int b = 20;
        int[] expectedResult = new int[] {};

        //Act
        int[] actualResult = sut.fizzArray3(a, b);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

}

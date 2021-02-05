package Katas11Thru20Tests;

import Katas11Thru20.Kata16;
import org.junit.Assert;
import org.junit.Test;

public class Kata16Test {

/*
Exercise 16: FizzArray
Create an integer array method called FizzArray that takes in an integer ”n”.
Given a number n, create and return a new int array of length n, containing
the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return
a length 0 array. You do not need a separate if-statement for the length-0 case;
the for-loop should naturally execute 0 times in that case, so it just works.
The syntax to make a new int array is: new int[desired_length]

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/

    Kata16 sut = new Kata16();

    @Test
    public void input_4_return_array_length_4(){
        //Arrange
        int n = 4;
        int[] expectedArray = {0, 1, 2, 3};

        //Act
        int[] resultArray = sut.FizzArray(n);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void input_1_return_array_length_1(){
        //Arrange
        int n = 1;
        int[] expectedArray = {0};

        //Act
        int[] resultArray = sut.FizzArray(n);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

    @Test
    public void input_10_return_array_length_10(){
        //Arrange
        int n = 10;
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Act
        int[] resultArray = sut.FizzArray(n);

        //Assert
        Assert.assertArrayEquals(expectedArray, resultArray);

    }

}

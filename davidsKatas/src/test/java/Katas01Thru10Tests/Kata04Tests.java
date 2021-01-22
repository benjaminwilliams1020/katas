package Katas01Thru10Tests;

import Katas01Thru10.Kata04;
import org.junit.Assert;
import org.junit.Test;

public class Kata04Tests {

    /*
Exercise 4: Start1
Create an integer method called Start1 that takes in two integer arrays "a" and "b".
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
*/
    Kata04 sut = new Kata04();

    @Test
    public void both_arrays_start_with_1_result_is_2() {
        //Arrange
        int[] testArrayOne = new int[] {1, 2, 3};
        int[] testArrayTwo = new int[] {1, 3};
        int expectedResult = 2;

        //Act
        int result = sut.start1(testArrayOne, testArrayTwo);

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void only_first_array_start_with_1_result_is_1() {
        //Arrange
        int[] testArrayOne = new int[] {7, 2, 3};
        int[] testArrayTwo = new int[] {1};
        int expectedResult = 1;

        //Act
        int result = sut.start1(testArrayOne, testArrayTwo);

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void only_second_array_start_with_1_result_is_1() {
        //Arrange
        int[] testArrayOne = new int[] {1, 2};
        int[] testArrayTwo = new int[] {};
        int expectedResult = 1;

        //Act
        int result = sut.start1(testArrayOne, testArrayTwo);

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void neither_array_starts_with_1_result_is_0() {
        //Arrange
        int[] testArrayOne = new int[] {2, 3};
        int[] testArrayTwo = new int[] {4, 5};
        int expectedResult = 0;

        //Act
        int result = sut.start1(testArrayOne, testArrayTwo);

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void both_arrays_are_empty_result_is_0() {
        //Arrange
        int[] testArrayOne = new int[] {};
        int[] testArrayTwo = new int[] {};
        int expectedResult = 0;

        //Act
        int result = sut.start1(testArrayOne, testArrayTwo);

        //Assert
        Assert.assertEquals(expectedResult, result);

    }

}

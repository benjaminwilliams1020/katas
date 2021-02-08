package Katas11Thru20Tests;

import Katas11Thru20.Kata20;
import org.junit.Assert;
import org.junit.Test;

public class Kata20Tests {

/*
Exercise 20: BiggerTwo
Create an integer array method called BiggerTwo that takes in two integer arrays “a” and “b”.
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/

   Kata20 sut = new Kata20();

   @Test
   public void second_array_bigger_than_first_v1() {
       //Arrange
       int[] a = {1, 2};
       int[] b = {3, 4};
       int[] expectedResult = b;

       //Act
       int[] actualResult = sut.biggerTwo(a, b);

       //Assert
       Assert.assertEquals(expectedResult, actualResult);

   }

    @Test
    public void first_array_bigger_than_second_v1() {
        //Arrange
        int[] a = {3, 4};
        int[] b = {1, 2};
        int[] expectedResult = a;

        //Act
        int[] actualResult = sut.biggerTwo(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void second_array_bigger_than_first_v2() {
        //Arrange
        int[] a = {1, 1};
        int[] b = {1, 2};
        int[] expectedResult = b;

        //Act
        int[] actualResult = sut.biggerTwo(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void both_arrays_same_sum_return_a() {
        //Arrange
        int[] a = {1, 1};
        int[] b = {1, 1};
        int[] expectedResult = a;

        //Act
        int[] actualResult = sut.biggerTwo(a, b);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

}

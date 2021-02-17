package Katas21Thru30Tests;

import Katas21Thru30.Kata25;
import org.junit.Assert;
import org.junit.Test;

public class Kata25Tests {

/*
Exercise 25: IsStrictlyIncreasing
Create a boolean method called IsStrictlyIncreasing that
takes in an integer array “nums”. Given an array of
integers, return true if the values are strictly increasing.
Return false otherwise

isStrictlyIncreasing([5,7,8,10]) → true
isStrictlyIncreasing([5,7,7,10]) → false
isStrictlyIncreasing([-5,-3,0,17]) → true
*/

    Kata25 sut = new Kata25();

    @Test
    public void is_increasing_v1()  {
        //Arrange
        int[] testArray = {5,7,8,10};

        //Act
        boolean result = sut.isStrictlyIncreasing(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void is_not_increasing_v1()  {
        //Arrange
        int[] testArray = {5,7,7,10};

        //Act
        boolean result = sut.isStrictlyIncreasing(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void is_increasing_v2()  {
        //Arrange
        int[] testArray = {-5,-3,0,17};

        //Act
        boolean result = sut.isStrictlyIncreasing(testArray);

        //Assert
        Assert.assertTrue(result);

    }

/*
isStrictlyIncreasing([5,7,8,10]) → true
isStrictlyIncreasing([5,7,7,10]) → false
isStrictlyIncreasing([-5,-3,0,17]) → true
 */

}



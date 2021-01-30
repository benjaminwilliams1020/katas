package Katas11Thru20Tests;

import Katas11Thru20.Kata14;
import org.junit.Assert;
import org.junit.Test;

public class Kata14Tests {

/*
Exercise 14: LessBy10
Create a boolean method called LessBy10 that take in three integers,
 “a, “b”, and “c”. Given three ints, a b c, return true if one of
them is 10 or more different than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
*/

    Kata14 sut = new Kata14();

    @Test
    public void first_test() {
        //Arrange
        int a = 1;
        int b = 7;
        int c = 11;

        //Act
        boolean result = sut.lessBy10(a, b, c);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void second_test() {
        //Arrange
        int a = 1;
        int b = 7;
        int c = 10;

        //Act
        boolean result = sut.lessBy10(a, b, c);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void third_test() {
        //Arrange
        int a = 11;
        int b = 1;
        int c = 7;

        //Act
        boolean result = sut.lessBy10(a, b, c);

        //Assert
        Assert.assertTrue(result);

    }

}

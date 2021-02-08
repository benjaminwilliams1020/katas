package Katas11Thru20Tests;

import Katas11Thru20.Kata18;
import org.junit.Assert;
import org.junit.Test;

public class Kata18Tests {

/*
Exercise 18: EvenlySpaced
Create a boolean method called EvenlySpaced that takes in three integers, “a”, “b”, and “c”;
Given three ints, a b c, one of them is small, one is medium and one is large. Return true
if the three values are evenly spaced, so the difference between small and medium is the same
as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

    Kata18 sut = new Kata18();

    @Test
    public void given_2_4_6_returns_true() {
        //Arrange
        int a = 2;
        int b = 4;
        int c = 6;

        //Act
        boolean result = sut.evenlySpaced(a, b, c);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void given_4_6_2_returns_true() {
        //Arrange
        int a = 4;
        int b = 6;
        int c = 2;

        //Act
        boolean result = sut.evenlySpaced(a, b, c);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void given_4_6_3_returns_false() {
        //Arrange
        int a = 4;
        int b = 6;
        int c = 3;

        //Act
        boolean result = sut.evenlySpaced(a, b, c);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void given_1002_375_3684_returns_false() {
        //Arrange
        int a = 1002;
        int b = 375;
        int c = 3684;

        //Act
        boolean result = sut.evenlySpaced(a, b, c);

        //Assert
        Assert.assertFalse(result);

    }

/*
evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

}

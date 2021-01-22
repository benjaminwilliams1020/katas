package Katas01Thru10Tests;

import Katas01Thru10.Kata03;
import org.junit.Assert;
import org.junit.Test;

public class Kata03Tests {

    /*
Exercise 3: GreenTicket
Create an integer method called GreenTicket that takes in three integers, "a". "b", and "c"
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all
ifferent from each other,  the result is 0. If all of the numbers are the same,
the result is 20. If two of the numbers are the same, the  result is 10.
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/
    Kata03 sut = new Kata03();

    @Test
    public void no_numbers_are_the_same_result_0() {
        //Arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 0;


        //Act
        int result = sut.greenTicket(a, b, c);

        //Assert
        Assert.assertEquals(expected, result);

    }

    @Test
    public void three_numbers_are_the_same_result_20() {
        //Arrange
        int a = 2;
        int b = 2;
        int c = 2;
        int expected = 20;

        //Act
        int result = sut.greenTicket(a, b, c);

        //Assert
        Assert.assertEquals(expected, result);

    }

    @Test
    public void two_numbers_are_the_same_result_10() {
        //Arrange
        int a = 1;
        int b = 2;
        int c = 1;
        int expected = 10;

        //Act
        int result = sut.greenTicket(a, b, c);

        //Assert
        Assert.assertEquals(expected, result);

    }
}

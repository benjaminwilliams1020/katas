package Katas01Thru10Tests;

import Katas01Thru10.Kata05;
import Katas01Thru10.Kata07;
import org.junit.Assert;
import org.junit.Test;

public class Kata07Tests {

    /*
Exercise 7: NoTriples
Create a boolean method called NoTuples that takes in an integer array “nums”.
Given an array of ints, we'll say that a triple is a value appearing 3 times
in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

    Kata07 sut = new Kata07();

    @Test
    public void no_triples_v1_returns_true() {
        //Arrange
        int[] testArray = {1, 1, 2, 2, 1};

        //Act
        boolean result = sut.noTuples(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void no_triples_v2_returns_true() {
        //Arrange
        int[] testArray = {1, 1, 2, 1, 1, 2, 2};

        //Act
        boolean result = sut.noTuples(testArray);

        //Assert
        Assert.assertTrue(result);

    }

    @Test
    public void has_triples_v1_returns_false() {
        //Arrange
        int[] testArray = {1, 1, 2, 2, 2, 1};

        //Act
        boolean result = sut.noTuples(testArray);

        //Assert
        Assert.assertFalse(result);

    }

    @Test
    public void has_triples_v2_returns_false() {
        //Arrange
        int[] testArray = {1, 1, 1, 2, 2, 2, 1};

        //Act
        boolean result = sut.noTuples(testArray);

        //Assert
        Assert.assertFalse(result);

    }

}

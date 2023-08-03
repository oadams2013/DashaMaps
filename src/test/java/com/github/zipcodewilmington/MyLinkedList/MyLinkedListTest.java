package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        //When
        mll.add(expectedKey, expectedValue);
        MyNode actual = mll.getHead().getNext();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size() {
        //Given
        int expected = 2;
        MyLinkedList mll = new MyLinkedList("manny");
        mll.add("brent", 6);
        //When
       int actual = mll.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
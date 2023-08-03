package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void addTest() {
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
    public void sizeTest() {
        //Given
        int expected = 1;
        MyLinkedList mll = new MyLinkedList("manny");
        mll.add("brent", 6);
        //When
       int actual = mll.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        mll.add("brent", 6);
        //When
        MyNode actual = mll.getHead().getNext();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");

        //When
        boolean actual = mll.isEmpty();
        //Then
        Assert.assertEquals(true, actual);
    }
    public void isNotEmpty(){
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        mll.add("brent", 6);
        //When
        boolean actual = mll.isEmpty();
        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void remove() {
        //Given
        MyLinkedList mll = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;

        mll.add("brent", 6);
        //When
        Integer actualValue = mll.remove(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(true, mll.isEmpty());
    }
}
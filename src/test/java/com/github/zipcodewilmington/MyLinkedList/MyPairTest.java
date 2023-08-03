package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void getKey() {
    }

    @Test
    void setKey() {
        //Given
        String expectedKey = "pain";
        MyPair mypair = new MyPair("no", 3);
        //When
        mypair.setKey(expectedKey);
        String actualKey = mypair.getKey();
        //Then
        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    void setValue() {
        //Given
        Integer expectedValue = 19;
        MyPair mypair = new MyPair("no", 3);
        //When
        mypair.setValue(expectedValue);
        Integer actualValue = mypair.getValue();
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    void testEquals() {
    }

    @Test
    void getValue() {

    }
}
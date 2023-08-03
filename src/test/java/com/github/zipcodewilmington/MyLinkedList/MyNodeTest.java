package com.github.zipcodewilmington.MyLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {

    @Test
    void getNext() {
    }

    @Test
    void setNext() {
        //Given
        MyNode first = new MyNode("tolani", 1);
        MyNode second = new MyNode("Dima", 3);
        //When
        first.setNext(second);
        //Then
        Assert.assertEquals(second, first.getNext());
    }
    @Test
    void getData() {
    }

    @Test
    void testEquals() {
        //Given
        MyNode node1 = new MyNode("bisi", 10);
        MyNode node2 = new MyNode("bisi", 10);
        //When and then
        Assert.assertEquals(node1, node2);

    }
}
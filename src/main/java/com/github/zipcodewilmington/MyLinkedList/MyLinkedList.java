package com.github.zipcodewilmington.MyLinkedList;

public class MyLinkedList {
    MyNode head;

    // Head is start of the linked list
    //tail is where the null comes and the linked list ends
    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }

    public MyNode getHead() {
        return head;
    }

    public void add(String key, Integer value) {
        MyNode currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }

    public int size() {
        MyNode currentNode = head;
        int ctr = 0;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            ctr++;
        }
        return ctr;
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    } // we are checking if the next node is empty

    public MyNode get(String key) {

        MyNode currentNode = head;

        while (currentNode != null) {

            if (currentNode.getData().getKey().equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public Integer remove(String key) { //its giiving a string (key) and returning and integer
        MyNode previousNode = head;
        MyNode currentNode = head.getNext();
        while (currentNode != null && !currentNode.getData().getKey().equals(key)) {
            currentNode = currentNode.getNext();
        }
        if (currentNode == null) {
            return null;
        }
        previousNode.setNext(currentNode.getNext());
        return currentNode.getData().getValue();
    }
}


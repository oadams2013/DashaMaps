package com.github.zipcodewilmington.MyLinkedList;

public class MyLinkedList {
    MyNode head;
// Head is start of the linked list
    //tail is where the null comes and the linked list ends
    public MyLinkedList(String key) {
       head = new MyNode(key, null );
    }

    public MyNode getHead() {
        return head;
    }
    public void add(String key, Integer value){
        MyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }
    public int size(){
        MyNode currentNode = head;
        int ctr = 1;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            ctr++;
        }
        return ctr;
    }


}


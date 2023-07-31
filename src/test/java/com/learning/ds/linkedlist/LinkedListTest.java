package com.learning.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void isEmptyTest(){
        LinkedList myList = new LinkedList();
        assertTrue(myList.isEmpty());

        myList.insertAtBeg(1);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void sizeTest(){
        LinkedList myList = new LinkedList();
        assertTrue(myList.isEmpty());
        assertEquals(0, myList.getSize());

        myList.insertAtBeg(1);
        myList.insertAtBeg(12);
        myList.insertAtBeg(45);
        assertFalse(myList.isEmpty());
        assertEquals(3, myList.getSize());
    }

    @Test
    public void insertAtBegTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtBeg(5);
        myList.insertAtBeg(4);
        myList.insertAtBeg(3);
        myList.insertAtBeg(2);
        myList.insertAtBeg(1);

        myList.printList();
    }

    @Test
    public void insertAtEndTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        myList.printList();
    }
}

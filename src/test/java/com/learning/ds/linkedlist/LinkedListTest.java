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

    @Test
    public void isExistIterativeTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        assertTrue(myList.isExistIterative(5));
        assertTrue(myList.isExistIterative(4));
        assertTrue(myList.isExistIterative(3));
        assertTrue(myList.isExistIterative(2));
        assertTrue(myList.isExistIterative(1));
        assertFalse(myList.isExistIterative(6));
    }

    @Test
    public void isExistRecTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        assertTrue(myList.isExistRec(5, myList.head));
        assertTrue(myList.isExistRec(4, myList.head));
        assertTrue(myList.isExistRec(3, myList.head));
        assertTrue(myList.isExistRec(2, myList.head));
        assertTrue(myList.isExistRec(1, myList.head));
        assertFalse(myList.isExistRec(6, myList.head));

    }

    @Test
    public void reverseIterativeTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        myList.printList();

        myList.reverseIterative();

        myList.printList();
    }

    @Test
    public void reverseRecTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        myList.printList();

        myList.head = myList.reverseRec(myList.head);

        myList.printList();
    }

    @Test
    public void reverseUsingStackTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        myList.printList();

        myList.reverseUsingStack();

        myList.printList();
    }
}

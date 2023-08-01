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

    @Test
    public void deleteFromBegTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(5);
        myList.insertAtEnd(4);
        myList.insertAtEnd(3);
        myList.insertAtEnd(2);
        myList.insertAtEnd(1);

        assertEquals(5, myList.getSize());

        Node deletedNode = myList.deleteFromBeg();
        assertEquals(5, deletedNode.data);
        assertEquals(4, myList.getSize());

        Node deletedNode1 = myList.deleteFromBeg();
        assertEquals(4, deletedNode1.data);
        assertEquals(3, myList.getSize());

        Node deletedNode2 = myList.deleteFromBeg();
        assertEquals(3, deletedNode2.data);
        assertEquals(2, myList.getSize());

        Node deletedNode3 = myList.deleteFromBeg();
        assertEquals(2, deletedNode3.data);
        assertEquals(1, myList.getSize());

        Node deletedNode4 = myList.deleteFromBeg();
        assertEquals(1, deletedNode4.data);
        assertEquals(0, myList.getSize());

        Node deletedNode5 = myList.deleteFromBeg();
        assertNull(deletedNode5);
        assertEquals(0, myList.getSize());
    }

    @Test
    public void deleteFromEndTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);
        myList.insertAtEnd(4);
        myList.insertAtEnd(5);

        assertEquals(5, myList.getSize());

        Node deletedNode = myList.deleteFromEnd();
        assertEquals(5, deletedNode.data);
        assertEquals(4, myList.getSize());

        Node deletedNode1 = myList.deleteFromEnd();
        assertEquals(4, deletedNode1.data);
        assertEquals(3, myList.getSize());

        Node deletedNode2 = myList.deleteFromEnd();
        assertEquals(3, deletedNode2.data);
        assertEquals(2, myList.getSize());

        Node deletedNode3 = myList.deleteFromEnd();
        assertEquals(2, deletedNode3.data);
        assertEquals(1, myList.getSize());

        Node deletedNode4 = myList.deleteFromEnd();
        assertEquals(1, deletedNode4.data);
        assertEquals(0, myList.getSize());

        Node deletedNode5 = myList.deleteFromEnd();
        assertNull(deletedNode5);
    }

    @Test
    public void deleteTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);
        myList.insertAtEnd(4);
        myList.insertAtEnd(5);

        assertEquals(5, myList.getSize());

        assertEquals(1, myList.delete(0).data);
        assertEquals(4, myList.getSize());

        assertEquals(3, myList.delete(1).data);
        assertEquals(3, myList.getSize());

        assertEquals(5, myList.delete(2).data);
        assertEquals(2, myList.getSize());

        assertNull(myList.delete(3));
        assertEquals(2, myList.getSize());

        assertEquals(4, myList.delete(1).data);
        assertEquals(1, myList.getSize());
    }

    @Test
    public void deleteByValueTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);
        myList.insertAtEnd(4);
        myList.insertAtEnd(5);

        myList.deleteByValue(6);
        assertEquals(5, myList.getSize());

        myList.deleteByValue(1);
        assertEquals(4, myList.getSize());

        myList.deleteByValue(5);
        assertEquals(3, myList.getSize());

        myList.deleteByValue(2);
        assertEquals(2, myList.getSize());
    }


    @Test
    public void getTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(10);
        myList.insertAtEnd(30);
        myList.insertAtEnd(14);

        assertEquals(30, myList.get(2).data);
        assertEquals(1, myList.get(0).data);
        assertEquals(10, myList.get(1).data);
        assertEquals(14, myList.get(3).data);
        assertNull(myList.get(4));
    }

    @Test
    public void getRecTest(){
        LinkedList myList = new LinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(10);
        myList.insertAtEnd(30);
        myList.insertAtEnd(14);

        assertEquals(30, myList.getRec(myList.head,2).data);
        assertEquals(10, myList.getRec(myList.head,1).data);
        assertEquals(14, myList.getRec(myList.head,3).data);
        assertNull(myList.getRec(myList.head,4));
    }
}

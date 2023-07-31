package com.learning.ds.linkedlist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    // Basic Operations

    // Insertions

    // insert at beginning

    // Time Complexity : O(1)
    // Auxiliary Space : O(1)
    public void insertAtBeg(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    // insert after given node

    // Time Complexity : O(1)
    // Auxiliary Space : O(1)
    public void insertAfterGivenNode(Node prevNode, int data){
        if(prevNode == null){
            insertAtBeg(data);
            return;
        }

        Node node = new Node(data);
        node.next = prevNode.next;
        prevNode.next = node;
        size++;
    }

    // insert at end of list

    // Time Complexity : O(N)
    // Auxiliary Space : O(1)
    public void insertAtEnd(int data){
        Node node = new Node(data);

        if(this.head == null){
            head = node;
            size++;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        size++;
    }

    // Time Complexity : O(1)
    // Auxiliary Space : O(1)
    public int getSize(){
        return size;
    }

    // Time Complexity : O(N)
    // Auxiliary Space : O(1)
    public void printList(){
        Node temp = this.head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Time Complexity : O(1)
    // Auxiliary Space : O(1)
    public boolean isEmpty(){
        return this.head == null;
    }


    // Element exist in LinkedList or not

    // Time Complexity : O(N)
    // Auxiliary Space : O(1)
    public boolean isExistIterative(int item){
        Node temp = this.head;

        while(temp != null){
            if(temp.data == item){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Time Complexity : O(N)
    // Auxiliary Space : O(N)
    public boolean isExistRec(int item, Node head){
        if(head == null)
            return false;
        if(head.data == item)
            return true;

        return isExistRec(item, head.next);
    }

}

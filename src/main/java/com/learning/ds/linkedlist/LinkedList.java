package com.learning.ds.linkedlist;

import java.util.Stack;

// https://www.geeksforgeeks.org/data-structures/linked-list/

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

    private static int count;

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

    // Time Complexity : O(N)
    // Auxiliary Space : O(1)
    public void reverseIterative(){
        Node curr = this.head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        this.head = prev;
    }

    // Time Complexity : O(N)
    // Auxiliary Space : O(N)
    public Node reverseRec(Node head){
        if(head == null || head.next == null)
            return head;

        Node rest = reverseRec(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    // Time Complexity : O(N)
    // Auxiliary Space : O(N)
    public void reverseUsingStack(){
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while(temp.next != null){
            stack.push(temp);
            temp = temp.next;
        }

        head = temp;

        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
        }

        temp.next = null;
    }

    // Deletion Program

    // Time Complexity : O(1)
    // Auxiliary Space : O(1)
    public Node deleteFromBeg(){
        if(head == null)
            return head;
        Node deletedNode = head;
        head = head.next;
        size--;
        return deletedNode;
    }


    // Time Complexity : O(N)
    // Auxiliary Space : O(1)
   public Node deleteFromEnd(){
        if(head == null)
            return head;

        if(head.next == null){
            Node deleteNode = head;
            head = head.next;
            size--;
            return deleteNode;
        }

        Node temp = head;
        Node prev = null;

        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }

        Node deletedNode = temp;
        prev.next = temp.next;
        size--;
        return deletedNode;
   }

   public Node delete(int index){
        if(head == null)
            return head;

        if(index == 0){
            Node deletedNode = head;
            head = head.next;
            size--;
            return deletedNode;
        }

        int i = 0;
        Node temp = head;
        Node prev = null;

        while(temp != null && i < index){
            prev = temp;
            temp = temp.next;
            i++;
        }

        if(temp == null || prev.next == null){
            return null;
        }

        Node deletedNode = temp;
        prev.next = temp.next;
        size--;
        return deletedNode;

   }

   public void deleteByValue(int value){
        if(head == null)
            return ;

        if(head.data == value){
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        Node prev = null;

        while(temp != null && temp.data != value){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;
        size--;
        prev.next = temp.next;
   }

   public Node deleteByValueRec(Node head, int value){
        if(head == null) return null;

        if(head.data == value){
            Node deletedNode = head;
            head = head.next;
            return deletedNode;
        }

        return deleteByValueRec(head.next, value);
   }

   public Node get(int index){
        if(head == null) return head;

        Node temp = head;
        int i = 0;

        while(temp != null && i < index){
            temp = temp.next;
            i++;
        }

        if(temp == null) return null;

        return temp;
   }

   public Node getRec(Node head, int index){
        if(head == null) return head;

        if(index == 0)
            return head;

        return getRec(head.next, index - 1);
   }


   public Node getFromLast(int index){
        Node temp = head;
        Node prev = head;
        int i = 0;

        while(temp != null && i < index){
            temp = temp.next;
            i++;
        }

        if(temp == null) return null;

        while(temp.next != null){
            prev = prev.next;
            temp = temp.next;
        }

        return prev;
   }

   //TODO: Need to be updated
   public Node getFromLastRec(Node head, int index){
        if(head == null)
            return null;

       if(count == index)
           return head;


        getFromLastRec(head.next, index);

        count = count + 1;



        return null;
   }

   public Node findMiddle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
   }

   public int count(int value){
        int count = 0;
        Node temp = head;

        while(temp != null){
            if(temp.data == value){
                count++;
            }
            temp = temp.next;
        }

        return count;
   }

   public boolean isCircular(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
                return true;
        }

        return false;
   }

   public void printReverseUsingRec(Node head){
        if(head == null) {
            return;
        }
        printReverseUsingRec(head.next);
        System.out.print(head.data+ "->");
   }

   public int cycleLength(){

        Node fastPtr = head;
        Node slowPtr = head;

        boolean isCycleExists = false;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr){
                return countNodes(slowPtr);
            }
        }
        
        return 0;
   }

    private int countNodes(Node slowPtr) {
        int length = 1;
        Node temp = slowPtr;

        while(temp.next != slowPtr){
            length++;
            temp = temp.next;
        }

        return length;
    }
}

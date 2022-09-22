package com.NepalCode.LinkedList;

/**
 *
 * @author mrg1813
 */
public class DeleteLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DeleteLinkedList() {
        this.size = 0;
    }

    // delete first element
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    private class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

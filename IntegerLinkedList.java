package com.company;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        if (head == null || head.getValue() >= value) {
            addToFront(value);
        } else {
            IntegerNode current = head.getNext();
            IntegerNode previous = head;
            IntegerNode node = new IntegerNode(value);
            while (current != null && current.getValue() < value) {
                current = current.getNext();
                previous = previous.getNext();
            }
            if (current == null) {
                previous.setNext(node);

            } else {
                node.setNext(current);
                previous.setNext(node);
            }

            // add your code here

        }
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}

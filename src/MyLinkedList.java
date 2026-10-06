/**
 * MyLinkedList.java
 * MEMBER 3: Linked List component.
 * A singly linked list of integers, with insert, delete, search, and display.
 *
 * This version is the first piece: nodes, insert at the end, and display.
 * Delete and search stay as placeholders so the rest of the program still compiles.
 */
public class MyLinkedList {

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;

    // Insert a value at the end of the list
    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Delete comes in the next push.
    public boolean delete(int value) {
        return false;
    }

    // Search comes in the next push.
    public int search(int value) {
        return -1;
    }

    // Show every value in the list
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.print("Linked list: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}

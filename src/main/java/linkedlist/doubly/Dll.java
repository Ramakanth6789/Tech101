package linkedlist.doubly;

public class Dll {
    Node head;



    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printDoubly(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data+", ");
            curr = curr.next;
        }
    }

    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    public static void insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        Node curr = head;

        while (curr.next!= null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
    }

    public static void main(String[] args) {
        Dll doublyLinkedList = new Dll();
        Node node = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        doublyLinkedList.head = node;

        doublyLinkedList.head.next = node2;
        node2.prev = doublyLinkedList.head;

        node2.next = node3;
        node3.prev = node2;

        printDoubly(doublyLinkedList.head);
        System.out.println();
        doublyLinkedList.head = insertBegin(doublyLinkedList.head, 5);
        printDoubly(doublyLinkedList.head);
        insertAtEnd(doublyLinkedList.head, 40);
        System.out.println();
        printDoubly(doublyLinkedList.head);


    }
}

package linkedlist;

public class DetectLoopLinkedList {
    Node head;
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;

        System.out.println(detectLoop(head));

    }
    public static int detectLoop(Node head){
        if (head == null || head.next == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countNodes(slow);
            }
        }
        return 0;
    }

    private static int countNodes(Node slow) {
        Node current = slow;
        int count = 1;

        while (current.next != slow) {
            current = current.next;
            count++;
        }
        return count;
    }


}

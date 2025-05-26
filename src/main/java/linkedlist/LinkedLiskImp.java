package linkedlist;

public class LinkedLiskImp {

    Node head;
    static class Node {

        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.value+", ");
            n = n.next;
        }
    }

    public void recursivePrint(Node head){
        if (head == null) {
            return;
        }
        System.out.print(head.value+", ");
        recursivePrint(head.next);
    }

    public static void insertInPosition(Node head, int position, Node newNode){
        Node current = head;
        for(int i=2; i<position;i++){
            current = current.next;
        }
        if(current!=null){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public static int findNode(Node head, int num) {
        int position = 1;
        Node current = head;
        while (current != null) {
            if (current.value == num) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

    public static int findNodeRecursive(Node head, int num) {
        int position = 1;
        if (head == null) {
            return -1;
        }

        if (head.value == num) {
            return 1;
        }else{
            int res = findNode(head.next, num);
            if (res == -1) {
                return -1;
            } else {
                return res+1;
            }
        }
    }


    public static void main(String[] args) {
        LinkedLiskImp list = new LinkedLiskImp();
        list.head = new Node(10);
        Node second = new Node(20);
        Node thrid = new Node(30);

        list.head.next = second;
        second.next = thrid;

        Node newNode = new Node(4);
        newNode.next = list.head;
        list.head = newNode;

        Node middleNode = new Node(15);

        middleNode.next  = list.head.next.next;
        list.head.next.next = middleNode;

        Node lastNode = new Node(100);
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = lastNode;

        Node insertNode = new Node(50);

        list.printList();
        System.out.println();
        insertInPosition(list.head,6,insertNode);
        insertInPosition(list.head,7,new Node(60));

        list.recursivePrint(list.head);
        System.out.println(        );
        list.head = list.head.next;
        list.recursivePrint(list.head);

        Node current = list.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println();

        list.recursivePrint(list.head);
        System.out.println();
        System.out.println(findNode(list.head, 50));
        System.out.println(findNodeRecursive(list.head, 50));



    }



}

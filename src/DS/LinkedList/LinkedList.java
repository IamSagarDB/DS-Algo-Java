package DS.LinkedList;

public class LinkedList {

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public Node head;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head; // for inserting element into LL we need to travers from head to tail so this node in
            // referred to head
            while (n.next != null) {  // traversing till the last node
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node(data);
        Node n = head;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next; //getting reference of (index-1) node to n node
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if (index==0){
            head = head.next;
        }else {
            Node n = head;
            Node n1 =null;
            for (int i = 0 ; i < index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

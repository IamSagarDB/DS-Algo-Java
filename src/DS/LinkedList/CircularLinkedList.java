package DS.LinkedList;

public class CircularLinkedList {
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node last;

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (last == null) {
            last = node;
        } else {
            node.next = last.next;
        }
        last.next = node;
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if (last == null){
            last = node;
            last.next = last;
        }else {
            node.next = last.next;
            last.next = node;
            last = node;
        }
    }

    public void print() {
        if (last == null) {
            return;
        }
        Node node = last.next;
        while (node != last) {
            System.out.print(node.data + "--> ");
            node = node.next;
        }
        System.out.print(node.data);
    }
}


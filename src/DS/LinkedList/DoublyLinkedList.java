package DS.LinkedList;

public class DoublyLinkedList<T> {
    public class Node {
        public T data;
        public Node next;
        public Node previous;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    public int length = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return length;
    }

    public void insert(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            length++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            length++;
            temp.next = node;
            node.previous = temp;
        }
        tail = node;
    }

    public void insertAt(int index, T data) {
        if (index == 0) {

        } else {
            Node node = new Node(data);
            Node left = head;
            Node right;
            for (int i = 0; i < index - 1; i++) {
                left = left.next;
            }
            right = left.next;

            left.next = node;
            node.previous = left;

            right.previous = node;
            node.next = right;

            length++;
        }
    }

    public void showForward() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print(node.data);

    }

    public void showBackward() {
        Node node = tail;
        while (node.previous != null) {
            System.out.print(node.data + " --> ");
            node = node.previous;
        }
        System.out.print(node.data);

    }

    public void insertAtStart(T data){
        Node node = new Node(data);
        node.next = head;
        node.next.previous = node;
        head = node;
    }

    public void deleteAt(int index){
        Node node = head;
        Node left;
        Node right;
        for (int i = 0 ; i < index ;i++){
            node = node.next;
        }
        left = node.previous;
        right = node.next;
        node.previous.next = right;
        node.next.previous = left;
    }
}

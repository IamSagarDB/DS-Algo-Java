package DS.LinkedList;

public class SinglyLinkedList<T> {

    public  class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

    }

    public Node head;

    public void insert(T data) {

        Node node = new Node(data);
        //when first node is inserted then head will be pointing to null so let assign new first node to head
        if (head == null) {
            head = node;
        } else {
            //for inserting element into LL we need to travers from head to tail so this temp node in referred to head
            Node temp = head;
            while (temp.next != null) {  // traversing till the last null value node
                temp = temp.next;  // incrementing to next node
            }
            temp.next = node; //when temp node finds null value then new node reference address will assign to last node
        }
    }

    public void insertAtStart(T data) {
                /*
        creating new node.
        As we inserting at start of the LL then head will be pointing to first node, As head node address will be
        first node address so head address will be assign to new node.next
        and new node address will be assigned to first node
         */
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, T data) {
        Node node = new Node(data); // creating new node to be inserted
        Node temp = head; // this temp node will start traversing from head
        if (index == 0) { // if Index is 0 then insertAtStart() function will be called
            insertAtStart(data);
        } else {
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            node.next = temp.next; //getting reference of (index-1) node to n node
            temp.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node node = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            temp = node.next;
            node.next = temp.next;
        }
    }

    public void print() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print(node.data);
    }
}

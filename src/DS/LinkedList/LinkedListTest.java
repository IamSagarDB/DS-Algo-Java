package DS.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<String> ll = new SinglyLinkedList<>();
        ll.insert("Sagar");
        ll.insert("gowda");
        ll.insert("Codes");
        ll.insertAt(2,"Drop");
        ll.print();
    }
}

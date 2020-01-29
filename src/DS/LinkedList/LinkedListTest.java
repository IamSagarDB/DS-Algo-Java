package DS.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insertAtStart(10);
        c.insertAtStart(20);
        c.insertAtStart(30);
        c.insertAtStart(40);
        c.insertAtLast(5);
        c.insertAtLast(2);
        c.deleteAtFirst();
        c.deleteAtFirst();
        c.print();

    }
}

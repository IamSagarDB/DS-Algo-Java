package DS.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(50);
        linkedList.insert(30);
        linkedList.insertAtStart(80);
        linkedList.insertAtStart(90);
        linkedList.insertAt(4,44);
        linkedList.deleteAt(4);
        linkedList.deleteAt(2);

        linkedList.show();
    }
}

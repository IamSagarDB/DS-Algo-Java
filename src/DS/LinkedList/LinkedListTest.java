package DS.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
       DoublyLinkedList<String> dd = new DoublyLinkedList<>();
       dd.insert("sagar");
       dd.insert("gowda");
       dd.showForward();
        System.out.println();
        dd.showBackward();
        dd.insertAt(1,"mohan");
        System.out.println();
        dd.showForward();
        System.out.println();
        System.out.println(dd.size());
        dd.insertAtStart("hooo");
        System.out.println();
        dd.showForward();
        System.out.println();
        dd.deleteAt(2);
        System.out.println();
        dd.showForward();


    }
}

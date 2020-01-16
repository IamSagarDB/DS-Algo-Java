package DS.Queue;

public class Queue<T> {

    private class Node {
        private T data;
        private Node next;
        private Node(T data) {
            this.data = data;
        }
    }

    private Node tail;
    private Node head;
    int head_count = 0;
    int tail_count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public T peek() {
        return head.data;
    }

    public void enqueue(T data) {
        Node node = new Node(data);
        if (head == null) {  // first it check if head is null then the first inserted node will point to head
            head = node;
        }
        if (tail != null) {
            tail.next = node;
        }
        tail_count++;
        tail = node; // first ele inserted tail will point to first node and after that it will point to next node
    }

    public T dequeue() {
        T data = head.data;
        head = head.next;// head will point to next node address and when it reaches to end head will be assigned to null
        head_count++;
        return data;
    }

    public int size() {
        return (tail_count - head_count);
    }
}

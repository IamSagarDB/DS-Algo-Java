package DS.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue =new Queue(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println(queue.size());;
	}

}

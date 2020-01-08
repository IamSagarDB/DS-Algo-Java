package DS.Queue;

public class Queue {
	int[] queue;
	int front = 0;
	int rear = 0;
	int size;
	
	// queue Constructor
	public Queue(int size){
		this.size = size;
		queue = new int[size];
		rear = 0;
		front = 0;
	}
	
	//If queue is not full then this function adds the element to back of the queue or else it will print 'OverFlow' 
	public void enqueue(int element) {
		if(rear==size) {
			System.out.print("Overflow");
		}else {
			queue[rear]=element;
			rear++;
		}
	}
	//If queue is not empty then this function removes the element from front of the queue or else it will print 'UnderFlow'
	public void dequeue() {
		if(front == rear) {
			System.out.print("Underflow");
		}else {
			queue[front]=0;
			front++;
		}
	}
	// This function return front element of queue
	public int front() {
		return queue[front];
		
	}
	
	// this function check if the queue isEmpty
	public boolean isEmpty() {
		return (front==rear);
	}
	// this function print element in queue
	public void print() {
		for(int x : queue) {
			System.out.println(x);
		}
	}
	
	public int size(){
        return (rear-front);
    }
	
}

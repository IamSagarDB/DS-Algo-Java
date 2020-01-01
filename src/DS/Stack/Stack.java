package DS.Stack;

/*
 * @author Sagar D B (DropCodes)
 * Github: github.com/imdropcodes
 * Date: 01/01/2020
 * 
 * Implementing Stack using Array
 * 
 * Stack : 
 * It is a DataStructure. Which user LIFO (Last In First Out) ordering,
 * most recently added item into stack will removed first,
 * At starting stack top will be pointing to -1
 * 
 * there are 4 function of stack:
 * 
 * pop() : Remove top top item of the stack.
 * push(item): Add the item into top of the stack.
 * peek(): Return the top item of the stack.
 * isEmpty(): it return true only if stack is empty ie top pointing to -1.
 * 
 */

//Stack Class
public class Stack{
	
	private int top; // stack top
	private int size; //Size of array
	private int[] array; //stack array
	
	//Default Stack Constructor
	public Stack(){
		top = -1;
		size = 10;
		array = new int[size];
	}
	
	//Assigning Size for stack
	public Stack(int size) {
		top = -1;
		this.size = size;
		array = new int[size];
	}
	
	// Pushing an Element into stack
	public void push(int item) {
		//Before pushing element check if stack is full
		if(!isFull()) { 
			top++; // incrementing top value from -1 to 0 before pushing an element into stack
			array[top] = item;  //pushing element into stack array
		}
	}
		
	// Pop an Element from stack
	public int pop() {
		return array[top--]; // pop to last element of the stack and decrementing top value
	}
	
	// check if stack is empty
	public boolean isEmpty() {
		return top == -1; // checking if stack top pointing to -1 (under flow)
	}
	
	// return the top element of stack
	public int peek() {
		return array[top]; 
	}
		
	// method to check if stack is full
	public boolean isFull() {
		
		// if Top is point to length of stack array then return stack is full
		if(top == array.length-1) {
			return true;
		}
	    return false;
	}
}

package DS.Stack;

public class StackTest {

    public static void main(String[] args) {
    	Stack stack = new Stack();
    	stack.push(10);
    	stack.push(20);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
    }
}

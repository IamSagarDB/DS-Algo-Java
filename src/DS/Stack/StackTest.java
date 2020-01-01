package DS.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.pop();
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());

	}

}

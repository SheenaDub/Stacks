package stacks;

public class PCQ2L {

	
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		System.out.println(stack);	
		stack.push(new Character('e'));	
		System.out.println(stack);
		stack.push(new Character('s'));	
		System.out.println(stack);
		stack.push(new Character('c'));	
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(new Character('u'));
		System.out.println(stack);
		stack.push(new Character('a'));
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(new Character('o'));
		System.out.println(stack);
		stack.push(new Character('t'));
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(new Character('h'));
		System.out.println(stack);
	
	}// end main
	
	
	
	
} // end class

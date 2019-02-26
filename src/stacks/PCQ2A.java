package stacks;

public class PCQ2A {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
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
	
	
	
	
	
	
	
}

package stacks;

/** * Class to implement Array-based Stack ADT  */


public class ArrayStack implements Stack {

	protected Object S[]; // array of objects - to hold the stack elements
	protected int N; // actual array size
	public static final int CAPACITY = 1000; // capacity for default array
	protected int top = -1; // top index (location of top value in array)
	
	
	/** * Default (no-arg) constructor, 
	 * creates array of objects
	 * with 1000 elements. */
	public ArrayStack(){
		this(CAPACITY);
	} // end default constructor
	
	/** *Constructor that creates array of objects of length specified by user 
	 * @param capacity, an integer, length of object array. */
	public ArrayStack(int capacity){
		N = capacity;
		S = new Object[N];
	} // end constructor
	
	
	
	/** * Insert an element at the top
	of the stack.
	* @param element, o, to be inserted. */	
	public void push(Object element) throws FullStackException  {
		if (size() == N) throw new FullStackException("The stack is full"); 
		
		else {
		top = top+1;
		S[top]=element;}
	}
	
	
	/** Return the number of elements in the stack
	* @return an integer, the number of elements in the stack */
	public int size() {
		return top + 1;
	}
	
	/** Return whether the stack is empty or not 
	 *  stack
	 *@return true if empty, false if not */
	public boolean isEmpty() {
		return top<0;
	}
	
	
	/** * Remove the top element from
	the stack.
	* @return element removed (the top object).
	* @exception EmptyStackException if stack is empty. */
	public Object pop() throws EmptyStackException {
		Object temp; // temporary variable to store object to be popped
		
		if (isEmpty()) throw new EmptyStackException("Empty stack: cannot pop");
		
		temp = S[top];
		S[top]=null; // dereference S[top] for garbage collection
		top=top-1;
		return temp;
	}
	
	
	/** * Inspect the element at the top of the
	stack.
	* @return top element in the stack.
	* @exception EmptyStackException if stack is empty. */
	public Object top() throws EmptyStackException {
		
		if (isEmpty()) throw new EmptyStackException("Empty stack: cannot perform top method");
		
		return S[top];
	}
	
	/** * String representation of element stored in stack, 
	 * from bottom to top, and number of elements in stack
	* @return string that represents stack */
	public String toString() {
		String output;
		int size = size();
		output = "";
		if (isEmpty()) {output += " " + size;}
		if (size()>0) output = " " + size + "\t" + S[0];
		if (size()>1) for (int i=1; i<=size-1; i++) {
			output+= " " + S[i];}
		
		return output;
	}
	
	// inner class for full stack exception
	@SuppressWarnings("serial")
	public class FullStackException extends
	RuntimeException 

	{
	public FullStackException(String err) {
	super(err); } 

	}
	
	
	
	
	// main method to test implementation of class
	public static void main(String[] args) {
		ArrayStack s = new ArrayStack();
		System.out.println(s);	
		s.push("A");	
		System.out.println(s);
		s.push("B");
		System.out.println(s);
		s.push("C");
		System.out.println(s);
		} // end main
	
	
	
	
	
	
} // end outer class


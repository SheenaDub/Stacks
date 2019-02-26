package stacks;

/** * Class to implement Linked list-based Stack ADT  */

public class LinkedStack implements Stack {

	
		int size; // no. of objects in stack
		Node top; // this is a reference to the top node in stack
		
		// default constructor, creates empty stack
		public LinkedStack() {
		top = null;
		size = 0;
		}
	
		
/** * Insert an element at the top
of the stack.
* @param element, o, to be inserted. */	
public void push(Object o) {
	Node node = new Node(o);
	node.next = top;
	top = node;
	size++;
	}
		
		
		
/** * Remove the top element from
the stack.
* @return element removed (the top object).
* @exception EmptyStackException if stack is empty. */			
public Object pop() throws EmptyStackException{
	
Object temp; // temporary variable to store object to be popped
	
if (isEmpty()) throw new EmptyStackException("Empty stack: cannot pop");
	
temp = top.element;
	
top.element=null;
top = top.next;
size= size-1;
	
return temp;
		}
			
/** * Inspect the element at the top of the
stack.
* @return top element in the stack.
* @exception EmptyStackException if stack is empty. */
public Object top() throws EmptyStackException{

if (isEmpty()) 
{throw new EmptyStackException("Empty stack: cannot perform top method");}
return top.element;			
		} // end top
		
/** Return the number of elements in the stack
* @return an integer, the number of elements in the stack */
public int size() {
return size;
}


/** Return whether the stack is empty or not 
 *  stack
 *@return true if empty, false if not */
public boolean isEmpty() {
return size==0;
			}

/** * String representation of element stored in stack, 
and number of elements in stack
* @return string that represents stack */
public String toString() {
String output = "";
Node node = top;
while (node != null) {
	output = node.element.toString() + " " + output;
	node = node.next;
		}
	return "" + size + "\t" + output;
		}
		

		
		// inner class to represent Node
		public class Node {
			Object element;
			Node next;
			public Node(Object element) {
			this.element = element;
			}
			public String toString() {
			return element.toString();
			}	
		}// end inner class
		
		// main method to test implementation of linked stack
		public static void main(String[] args) {
			LinkedStack s = new LinkedStack();
			System.out.println(s);
			s.push("A");
			System.out.println(s);
			s.push("B");
			System.out.println(s);
			s.push("C");
			System.out.println(s);
			} // end main	
		
		
		
}

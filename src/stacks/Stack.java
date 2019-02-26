package stacks;



/** Interface for a stack ADT */


public interface Stack {
	
	
/** Return the number of elements in the stack
* @return number of elements in the stack */
public int size();
	
/** Return whether the stack is empty or not 
 *  stack
 *@return true if empty, false if not */
public boolean isEmpty();
	
/** * Inspect the element at the top of the
stack.
* @return top element in the stack.
* @exception EmptyStackException if
the stack is empty. */
public Object top() throws EmptyStackException;


/** * Insert an element at the top
of the stack.
* @param element to be inserted. */
public void push (Object element);
	
/** * Remove the top element from
the stack.
* @return element removed.
* @exception EmptyStackException if
the stack is empty. */
public Object pop() throws EmptyStackException; 


/** * Runtime exception that is thrown if user tries to call pop or top 
 * when stack is empty. */
@SuppressWarnings("serial")
public class EmptyStackException extends
RuntimeException 

{

public EmptyStackException(String err) {
super(err); } 


} 





	
} // end class

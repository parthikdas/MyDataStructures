package Stack;

import LinkedList.MyLinkedList;
public class MyStack<E> {
	
	/* Here are the details of functions which is available in MyLinkedList class
	 * 1.push(data)  -  adds the data in the stack.
	 * 2.pop()  -  deletes the last element of the stack.
	 * 3.peek()  -  returns the last element inserted.
	 * 4.empty()  -  tells whether the stack is empty or not.
	 * 5.search(e)  -  tells whether that element is present in the stack or not.
	 */

	MyLinkedList<E> ll=new MyLinkedList<>();
	
	public void push(E e)  //adds the data in the stack//
	{
		ll.add(e);
	}
	
	E pop() throws Exception  //deletes the last element of the stack//
	{
		if(ll.isEmpty())
		{
			throw new Exception("Popping from empty stack not allowed");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception  //returns the last element inserted//
	{
		if(ll.isEmpty())
		{
			throw new Exception("Peeking from empty stack not allowed");
		}
		return ll.getLast();
	}
	
	boolean empty()  //tells whether the stack is empty or not//
	{
		if(ll.isEmpty())
			return true;
		return false;
	}
	
	boolean search(E e) throws Exception  //tells whether that element is present in the stack or not//
	{
		if(ll.isEmpty())
		{
			throw new Exception("Peeking from empty stack not allowed");
		}
		if(ll.contains(e)) return true;
		return false;
	}
}

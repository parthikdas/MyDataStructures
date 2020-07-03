package Queue;

import LinkedList.MyLinkedList.Node;

public class MyQueue<E> {

	/*
	 * Here are the list of functions available :-
	 * 1.enqueue(data) - adds data in queue.
	 * 2.dequeue() - removes the first inserted element in queue.
	 * 3.peek() - returns the first element.
	 */
	private Node<E> head, rear;

	public void enqueue(E e) {  //adds data in queue//

		Node<E> toAdd = new Node<>(e);
		if (head == null) {
			head = rear = toAdd;
			return;
		}

		rear.next = toAdd;
		rear = rear.next;

	}

	public E dequeue() {  //removes the first inserted element in queue//

		if (head == null) {
			return null;
		}

		Node<E> temp = head;
		head = head.next;

		if (head == null) {
			rear = null;
		}

		return temp.data;
	}
	
	public E peek()  //returns the first element//
	{
		if(head==null) return null;
		return head.data;
	}
	
	
}

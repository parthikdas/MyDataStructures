package Deque;

public class MyDeque<E> {
	
	/*Here I am considering head is at left and tail is at right 
	 *    HEAD-->TAIL
	 *    
	 *    Here are the list of functions available :-
	 *    1.addToFirst(data)  -  adds the data in the head.
	 *    2.addToLast(data)  -  adds the data in the tail.
	 *    3.print()  -  prints the Deque.
	 *    4.getFirst()  -  returns the first element.
	 *    5.getLast()  -  returns the last element.
	 *    6.removeLast()  -  removes the last element i.e the tail.
	 *    7.removeFirst()  -  removes the first element i.e the head.
	 */
	
	Node<E> head,tail;
	
	public void addToFirst(E data) {   //adds the data in the head//
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
		} else {
			head.prev = toAdd; //Here I am considering head is at left and tail is at right//
			toAdd.next = head;  //if you want head to be at right and tail to be at left//
			head = head.prev;  //then head.next=toAdd;toAdd.prev=head;head=head.next;//
		}
	}
	
	public void addToLast(E data)  //adds the data on the tail//
	{
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
		} else {
			tail.next=toAdd;  //Here I am considering head is at left and tail is at right//
			toAdd.prev=tail;  //if you want head to be at right and tail to be at left//
			tail=tail.next;  //then tail.prev=toAdd;toAdd.next=tail;head=head.prev;//
		}
	}
	
	public void print()  //prints the Deque//
	{
		if(head==null)
		{
			return;
		}
		Node<E> temp=head;
		while(temp!=null) {
			System.out.println(temp.data);temp=temp.next;  //if head is at left then temp=temp.prev;//
		}
	}

	public E getFirst() {   //returns the first element//
		if (head == null) {
			return null;
		}
		return head.data;
	}
	
	public E getLast() {  //returns the last element//
		if (head == null) {
			return null;
		}
		return tail.data;
	}
	
	public E removeLast() {  //removes the last element i.e the tail//
		if (head == null) {
			return null;
		}
		Node<E> toRemove = tail;   //Here I am considering head is at left and tail is at right//
		if (tail.prev == null) {   //if you want head at right and tail at left then change // 
			tail = head = null;    //tail.next==null//
			return toRemove.data;
		}
		tail = tail.prev;  
		tail.next = null;   
		if (tail == null) {     //and all the "next" to "prev" and vice versa//
			head = null;  
		}
		return toRemove.data;
	}
	
	public E removeFirst() {  //removes the first element i.e the head//
		if (head == null) {
			return null;
		}
		Node<E> toRemove = head;   //Here I am considering head is at left and tail is at right//
		if(head.next==null) {      //if you want head at right and tail at left then change // 
			head=tail=null;        //head.prev==null//
			return toRemove.data;
		}
		head = head.next;  
		head.prev = null;  
		if (head == null) {   //and all the "next" to "prev" and vice versa//
			tail = null;
		}
		return toRemove.data;
	}
	
	public void reverse() {  //reverses the deque//
		if(head==null) return;
		
		 Node<E> temp = null; 
	        Node<E> current = head; 
	  
	        /* swap next and prev for all nodes of  
	         doubly linked list */
	        while (current != null) { 
	            temp = current.prev; 
	            current.prev = current.next; 
	            current.next = temp; 
	            current = current.prev; 
	        } 
	  
	        /* Before changing head, check for the cases like empty  
	         list and list with only one node */
	        if (temp != null) { 
	            head = temp.prev; 
	        } 
	}
	
	public static class Node<E>  //this is node class of doubly ended linked lists//
	{
		E data;
		Node<E> next,prev;
		 
		public Node(E data)
		{
			this.data=data;
			this.prev=this.next=null;
		}
	}
}

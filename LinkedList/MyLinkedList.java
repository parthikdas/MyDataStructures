package LinkedList;


public class MyLinkedList<E> {
	
	/* Here are the details of functions which is available in MyLinkedList class
	 * 1.add(data)  - Adding a new data at defined position.
	 * 2.add(data,position)  -  If you want to add in between the list.
	 * 3.get(position)  -  get the value which is at that index.
	 * 4.getLast()  -  get the last element in the list.
	 * 5.set(data,position)  -  for updating the data in list in specified position.
	 * 6.remove(position)  -  removed the value in specified position.
	 * 7.removeLast()  -  remove the last element in the list.
	 * 8.print()  -  Printing the list.
	 * 9.isEmpty()  -  checking for empty list.
	 * 10.size()  -  for getting the size of the list.
	 * 11.clear()  -  clears the whole list
	 * 12.contains(data)  -  checks whether that data is present in the list or not.
	 * 13.reverse()  -  reverses the list.
	 * 14.indexOf(data)  -  returns the index of the element in the list.
	 * 15.getHead()  -  returns the first node of the list.
	 * 16.sort() - complete.
	 * 17.midElement()  -  returns the mid element of the list.
	 * 18.moveToFront()  -  moves the last element of the list to the head.
	 */
	
	Node<E> head;
	public void add(E data)  //Adding a new data at defined position//
	{
		Node<E> toAdd =new Node<E>(data);
		if(isEmpty())  //checking if it is empty//
		{
			head=toAdd;
			return;
		}
		Node<E> temp=head;  //traversing in the list//
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	public void add(E data,int position) throws Exception  //if you want to add in between the list//
	{                  								//here the user should insert position between (0 - size of the list) //
		Node<E> toAdd =new Node<E>(data);			//so not from 1//
		
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		if(position>size()) throw new Exception("NOT POSSIBLE!! position is greater than size");
		
		position-=1;
		
		if(position==0)  //if it is to be inserted at first//
		{
			toAdd.next=head;
			head=toAdd;
			return;
		}
		
		
		Node<E> temp=head;  //if it is to be inserted anywhere middle //
		int c=0;
		while(temp!=null) {if(c==position) {break;}temp=temp.next;c++;}
		Node<E> temp1=temp.next;
		temp.next=toAdd;
		toAdd.next=temp1;
		
		
	}
	
	int indexOf(E data) throws Exception //returns the index of the element in the list//
	{
		if(isEmpty())
		{
			throw new Exception("Its a empty Linked List");
		}
		Node<E> temp = head;int c=0;
		while(temp!=null)
		{
			if(temp.data==data) {return c;} c++; temp=temp.next;
		}
		return -1;
	}
	
	
	E get(int position) throws Exception  //get the value which is at that index//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot get element from empty Linked List");
		}
		
		if(position<0)
		{
			throw new Exception("OUT of bound exception");
		}
		
		Node<E> temp=head;int c=0;
		while(temp!=null) {if(c==position) {break;}temp=temp.next;c++;}
		
		return temp.data;
	}
	
	public E getLast() throws Exception  //get the last element in the list//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot get last element from empty Linked List");
		}
		
		Node<E> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
	void set(E data,int position) throws Exception  //for updating the data in list in specified position//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot update element from empty Linked List");
		}
		
		if(position<0)
		{
			throw new Exception("OUT of bound exception");
		}
		
		Node<E> temp=head;int c=0;
		while(temp!=null) {if(c==position) {break;}temp=temp.next;c++;}
		temp.data=data;
	}
	
	void remove(int position) throws Exception //remove the value in specified position//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot remove  element from empty Linked List");
		}
		
		if(position<0)
		{
			throw new Exception("OUT of bound exception");
		}
		
		Node<E> temp=head;
		if(position == 0)  //this is a edge case as here the head is to be changed//
			{
			head=temp.next;
			return;
			}
		int c=0;	
		while(temp!=null) {if(c+1==position) {break;}temp=temp.next;c++;}
		Node<E> temp1=temp.next.next;
		temp.next=temp1;
		
	}
	
	public E removeLast() throws Exception  //for removing the last element in the list//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot remove last element from empty Linked List");
		}
		Node<E> temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return toRemove.data;
	}
	
	void print() throws Exception {  //Printing the list//
		if(isEmpty())
		{
			throw new Exception("Cannot print from empty Linked List");
		}
		
		Node<E> temp=head;
		while(temp!=null) {System.out.println(temp.data+" ");
		temp = temp.next;
		}
	}
	public boolean isEmpty()  //checking for empty list//
	{
		return head==null;
	}
	
	int size() throws Exception  //for getting the size of the list//
	{
		if(isEmpty())
		{
			throw new Exception("Its a empty Linked List");
		}
		
		int c=0;Node<E> temp=head;
		while(temp!=null) {temp=temp.next;c++;}
		return c;
	}
	
	void clear()  //clears the whole list//
	{
		 head=null;
	}
	
	public boolean contains(E data) throws Exception  //checks whether that data is present in the list or not//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot find from empty Linked List");
		}
		
		Node<E> temp=head;
		while(temp!=null) {if(temp.data==data) {return true;} temp=temp.next;}
		return false;
	}
	
	
	void reverse() throws Exception   //reverses the list//
	{
		if(isEmpty())
		{
			throw new Exception("Cannot reverse from empty Linked List");
		}
		
		Node<E> prev = null; 
        Node<E> current = head; 
        Node<E> next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
	}
	
	
	 public Node<E> getHead() {  //returns the first node of the list//
	        return head;
	    }
	 
	 
	 public void sort()  //sorts the elements of the list in bubble sort//
	 {
		 
	 }
	 
	 public E midElement() throws Exception   //returns the mid element of the list//
	 {
		/* One method could be :-
		 * Traverse the whole linked list and count the no. of nodes.
		 *  Now traverse the list again till count/2 and return the node at count/2.
		 *  but the best is :-
		 *  Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
		 *  When the fast pointer reaches end slow pointer will reach middle of the linked list.
		 *
		 */

		 if(isEmpty()) throw new Exception("cannot find mid element from empty list");
		 
		 if(head.next == null) return head.data;
		 
		 if(head.next.next == null) return head.next.data;
		 
		 Node<E> temp=head;
		 Node<E> temp1=head;
		 while(temp1!=null && temp1.next!=null)
		 {
			 temp=temp.next;
			 temp1=temp1.next.next;
		 }
		 return temp.data;
	 }
	 
	 public void moveToFront() throws Exception{  //moves the last element in the list to the head//
		 if(isEmpty())
		 throw new Exception("cannot transfer last element to head");
		 
		 if(head.next==null) return;
		 
		 Node<E> temp=head;
		 while(temp.next.next!=null) temp=temp.next;
		 Node<E> temp1=temp.next;
		 temp.next=null;
		 temp1.next=head;
		 head=temp1;
	 }
	
	public static class Node<E>  //this is the node class of singly linked list//
	{
		public E data;
		public Node<E> next;
		public Node(E data)
		{
			this.data=data;
			next=null;
		}
	}
}


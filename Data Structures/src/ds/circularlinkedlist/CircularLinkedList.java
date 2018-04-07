package ds.circularlinkedlist;

public class CircularLinkedList {

	private Node first;
	private Node last;
		
	public CircularLinkedList() {
		first=null;
		last=null;
	}

	public boolean isEmpty() {
		return(first==null);
	}
		
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
		
	}
		
	public int deleteFirst() {
		int temp = first.data;
		
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return temp;
	}
		
	public void displayList() {
		System.out.println("List (beginning to end) ");
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
		
		System.out.println();
	}
	
		public void insertLast(int data) {
			
			Node newNode = new Node();
			newNode.data = data;
			
			if(isEmpty()) {
				first=newNode;
			}
			else {
				last.next=newNode;
				last = newNode;				
			}
				
		}
		public Node deleteLast() {
			Node temp = last;
			last=first.next;
			return temp;
		}
		
		
		
}

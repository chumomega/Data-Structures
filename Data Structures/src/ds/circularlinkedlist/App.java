package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList list1 = new CircularLinkedList();
		list1.insertFirst(72);
		list1.insertFirst(13);
		list1.insertFirst(53);
		list1.insertFirst(94);
		list1.insertLast(9999999);
		
		list1.displayList();
		

	}

}

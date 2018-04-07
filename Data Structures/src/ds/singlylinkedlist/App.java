package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		list1.insertFirst(72);
		list1.insertFirst(13);
		list1.insertFirst(53);
		list1.insertFirst(94);
		list1.insertLast(9999999);
		
		list1.displayList();
		

	}

}

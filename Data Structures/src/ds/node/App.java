package ds.node;

public class App {

	public static void main(String[] args) {
		Node node1 = new Node();
		node1.data=7;

		Node node2 = new Node();
		node2.data=18;
		
		Node node3 = new Node();
		node3.data=3;
		
		Node node4 = new Node();
		node4.data=26;
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		System.out.println(listLength(node1));//
		System.out.println(listLength(node2));
		
	}
	
	public static int listLength(Node node1) {
		int length=0;
		
		Node currNode = node1;
		
		
		while(currNode!=null) {
			length++;
			currNode=currNode.next;
		}
		return length;
				
	}

}

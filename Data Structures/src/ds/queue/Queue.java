package ds.queue;

public class Queue {
	private int maxSize; //initializes set # of slots
	private long[] queueArray; //slots to maintain data
	private int front;// front of line
	private int rear; // back of line
	private int numItems; 
	
	public Queue(int size) {
		maxSize = size;
		queueArray = new long[maxSize];
		front=0;//first slot
		rear=-1; // no item to be considered the last item
		numItems = 0;
	}
	
	public void insert(long x) {
		if(rear == maxSize-1) {//rear at end or array
			rear = -1;
		}
			
		rear++;
		queueArray[rear] = x;
		numItems++;
	}
	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front=0;//set front back to 0th so we can utilize again
		}
		return temp;
	}
	public long peekFront() {
		return queueArray[front];
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i=0; i<queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println(" ]");
	}
	public boolean isEmpty() {
		return (numItems == 0);
	}
	public boolean isFull() {
		return(numItems == maxSize);
	}
}

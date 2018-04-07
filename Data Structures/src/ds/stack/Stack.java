package ds.stack;

public class Stack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char x) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		stackArray[top] = x;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return stackArray[-1];
		}
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public char peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (maxSize-1==top);
	}
	
	

}

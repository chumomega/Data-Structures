package adt;

public class Counter {
	
	private String name=null;
	private int position=0;
	
	
	public Counter(String str) {
		name=str;		
	}
	public void increment() {
		position++;
		
	}
	public int getCurrentValue() {
		return position;
		
	}
	public String toString() {
		return "Counter "+ name + " is " + position;		
	}

}

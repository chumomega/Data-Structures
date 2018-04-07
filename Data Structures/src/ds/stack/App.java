package ds.stack;

public class App {

	public static void main(String[] args) {
		/*Stack stack1 = new Stack(3);
		stack1.push(20);
		stack1.push(30);
		stack1.push(14);
		stack1.push(28);
		
		
		while(!stack1.isEmpty()) {
			long value = stack1.pop();
			System.out.println(value);
		}*/
		
		String string1 = "trythis";
		string1 = reverseSpelling(string1);
		System.out.println();
		System.out.println(string1);
		
		
		
	}
	
	public static String reverseSpelling(String word) {
		Stack backwords = new Stack(word.length()); //give the stack the size of the length of the array
		String reverseWord = new String();
		
		for(int i=0; i<word.length(); i++) {
			backwords.push(word.charAt(i));		//get the char at a specific position and add to stack	
		}
		
		for(int i=0; i<word.length();i++) {
			reverseWord += backwords.pop(); //go down the stack and add each element to string
		}
		
		return reverseWord;
	}
	
	
	
	
	
	

}

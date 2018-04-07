package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue queue1 = new Queue(5);
		queue1.insert(13);
		queue1.insert(34);
		queue1.insert(64);
		queue1.insert(656);
		queue1.insert(243);
		queue1.insert(844);
		queue1.insert(68);
		queue1.insert(342);
		queue1.insert(809);
		
		queue1.view();
	}

}

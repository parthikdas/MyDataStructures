package Queue;

public class MainClass {

	public static void main(String[] args) {
		MyQueue<Integer> g=new MyQueue<>();
		g.enqueue(12);
		g.enqueue(23);
		
		System.out.println(g.dequeue());
		System.out.println(g.peek());
		
	}

}

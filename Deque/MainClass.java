package Deque;

public class MainClass {

	public static void main(String[] args) {
		MyDeque<Integer> g=new MyDeque<>();
		g.addToFirst(23);
		g.addToFirst(32);
		g.addToFirst(34);
		g.addToLast(56);
		g.addToLast(90);
		g.removeLast();
		g.removeFirst();
		g.print();
		System.out.println();
		g.reverse();
		g.print();
		System.out.println();
		System.out.println(g.getFirst());
		System.out.println(g.getLast());
	}

}

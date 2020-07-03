package LinkedList;

public class MainClass {

	public static void main(String[] args) throws Exception{
		MyLinkedList<String> g=new MyLinkedList<>();
		g.add("apple");
		g.add("orange");
		g.add("mango");
		g.add("potato");
		g.add("tomato");
		g.add("newly added fruit",1);
		g.print();
		g.remove(0); 
		g.set("oats", 2);
		g.add("cheese", 3);
		g.reverse();
		g.print();
	    System.out.println(g.size());
	    System.out.println(g.get(g.size()-1));
		System.out.println(g.indexOf("tomato"));
		System.out.println(g.isEmpty());
		System.out.println(g.contains("newly added fruit"));
		System.out.println(g.getHead());
		System.out.println(g.midElement());
		System.out.println();
		g.moveToFront();
		g.print();
	}
	

}


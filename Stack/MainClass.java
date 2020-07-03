package Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> Stack=new MyStack<>();
		Stack.push(12);
		Stack.push(24);
		Stack.push(36);
		 
		int pop=Stack.pop();
		System.out.println(pop);
		
		int peek=Stack.peek();
		System.out.println(peek);
		System.out.println(Stack.empty());
		System.out.println(Stack.search(12));
	}

}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMin newStack = new StackMin();
		newStack.push(4);
		newStack.push(5);
		newStack.push(3);
		newStack.push(2);
		newStack.push(1);
		newStack.pop();
		newStack.pop();
		newStack.pop();

		System.out.println(newStack.min());
	}

}

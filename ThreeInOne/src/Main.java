
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeInOne newStacks = new ThreeInOne(3);
		newStacks.push(0,1);
		newStacks.push(0,2);
		newStacks.push(1,4);
		newStacks.push(1,5);
		newStacks.push(2,8);
		int result = newStacks.peek(0);
		System.out.println(result);
		
	}

}

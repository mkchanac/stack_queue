import java.util.Stack;

public class QueueViaStack{
	private Stack<Integer> stackNew;
	private Stack<Integer> stackOld;
	
	
	
	public QueueViaStack() {
		stackNew = new Stack<Integer>();
		stackOld = new Stack<Integer>();
	}

	public void enqueue(int value) {
		stackNew.push(value);
	}
	
	private void shiftElements() {
		if(stackOld.isEmpty()) {
			while(!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
		}
	}
	
	public int dequeue() {
		shiftElements();
		return stackOld.pop();
	}
	
	public int getFront() {
		shiftElements();
		return stackOld.peek();
	}
}
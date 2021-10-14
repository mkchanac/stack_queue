import java.util.ArrayList;

public class SetOfStacks {
	public ArrayList<Stack> stacks;
	public int capacity; // capacity of one stack

	public SetOfStacks(int capacity) {
		stacks = new ArrayList<Stack>();
		this.capacity = capacity;
	}

	private Stack getLastStack() {
		if (stacks.size() == 0)
			return null;
		else {
			return stacks.get(stacks.size() - 1);
		}
	}

	public void push(int value) {
		Stack lastStack = getLastStack();

		if (lastStack != null && !lastStack.isFull()) {
			lastStack.push(value);
		} else {
			Stack newStack = new Stack(capacity);
			newStack.push(value);
			stacks.add(newStack);
		}
	}

	public int pop() {
		Stack lastStack = getLastStack();
		return lastStack.pop();
	}

	private int leftShift(int index, boolean removeTop) {
		Stack stack = stacks.get(index);
		int result;
		if (removeTop) {
			result = stack.pop();
		} else {
			result = stack.removeBottom();
		}

		if (stack.size == 0) {
			stacks.remove(index);
		} else if (stacks.size() - 1 > index) {
			stack.push(leftShift(index + 1, false));
		} 
		
		return result;
	}

	public int popAt(int index) {
		return leftShift(index, true);
	}

}

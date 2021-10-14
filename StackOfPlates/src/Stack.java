import java.util.EmptyStackException;

public class Stack {
	public int capacity;
	public StackNode top;
	public StackNode bottom;
	public int size;

	public Stack(int capacity) {
		this.capacity = capacity;
		this.top = null;
		this.bottom = null;
		this.size = 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void join(StackNode above, StackNode below) {
		if (below != null) {
			below.above = above;
		}
		if (above != null) {
			above.below = below;
		}
	}

	public boolean push(int value) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return false;
		}
		StackNode newNode = new StackNode(value);
		size++;
		if (size == 1) {
			bottom = newNode;
		}
		join(newNode, top);
		top = newNode;
		return true;
	}

	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		int result = top.value;
		top = top.below;
		size--;
		return result;
	}

	public int removeBottom() {
		int bottomValue = bottom.value;
		bottom = bottom.above;
		if (bottom != null)
			bottom.below = null;
		size--;
		return bottomValue;

	}

}

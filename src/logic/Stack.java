package logic;

import java.util.EmptyStackException;

public class Stack {
	private int value[] = new int[10];
	private int size;

	private void emptyCheck() {
		 if (isEmpty())
		 throw new EmptyStackException();
	}

	public boolean isEmpty(){
		 return (size == 0);
	}

	public int top(){
		emptyCheck();
		return this.value[size - 1];
	}

	public void push(int value) {
		this.value[size] = value;
		size++;
	}

	public int size() {
		return size;
	}

	public void pop() {
		emptyCheck();
		size--;
	}

}

package StackQueues;

public class Stack<E> {
	static class StackNode<E>{
		E data;
		StackNode<E> next;
		
		public StackNode (E data){
			this.data =data;
		}
	}
	private StackNode<E> top;
	public void push(E item) {
		StackNode n = new StackNode(item);
		n.next = top;
		top = n;
	}
	
	public E pop() {
		if(top == null) {
			System.out.println("Stack is empty");
		}
		E data = top.data;
		top = top.next;
		return data;
	}
	public E peek() {
		if(top == null)
			System.out.println("Stack is Empty");
		return top.data;
	}
	public Boolean isEmpty() {
		return top == null;
	}
	}

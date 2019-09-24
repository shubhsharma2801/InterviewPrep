package StackQueues;

import LinkedList.Node;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues<Integer> intStack = new Queues<Integer>();
		intStack.add(10);
		intStack.add(20);
		intStack.add(30);
		intStack.add(40);
		System.out.println(intStack.remove());
		System.out.println(intStack.remove());
		Node n = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Stack<Node> nodeStack =new Stack<Node>();
		nodeStack.push(n);
		nodeStack.push(n1);
		nodeStack.push(n2);
		//System.out.println(nodeStack.pop().data);
		//System.out.println(nodeStack.peek().data);
	}

}

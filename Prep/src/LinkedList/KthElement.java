package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class KthElement {
	static Node head= null;
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data= data;
			next = null;
		}
	}
	public KthElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Node> nodeList = new ArrayList<Node>();
		Node n1 = new Node(10);
		appendNode(n1);
		Node n2 = new Node(20);
		appendNode(n2);
		Node n3 = new Node(30);
		appendNode(n3);
		printList();
		
		int data =findKthNode(head,1);
		System.out.println("data\t"+data);
	}

	private static int findKthNode(Node n,int k) {
		// TODO Auto-generated method stub
		if(n.next == null) {
			return 0;
		}
		int index = findKthNode(n.next,k) +1;
		if(index == k) {
			System.out.println("k\t"+n.data);
		}
		return index;
	}

	private static void printList() {
		// TODO Auto-generated method stub
		Node first = head;
		while(first != null) {
			System.out.println(first.data);
			first = first.next;
		}
	}

	private static void appendNode(Node node) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = node;
		}else {
			Node currentFirst = head;
			head = node;
			node.next = currentFirst;
		}
	}

}

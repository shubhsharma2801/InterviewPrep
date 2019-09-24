package LinkedList;

public class Node {
	static Node head = null;
	public int data;
	Node next;
	public Node(int d) {
		// TODO Auto-generated constructor stub
		data = d;
		next = null;
	}
	public static void appendToFirst(Node n) {
		if(head == null) {
			head = n;
		}else {
			Node currFirst = head;
			head = n;
			n.next = currFirst;
		}
	}
	//headPassed
	public static Node appendToFirst(Node n,Node headPassed) {
		if(headPassed == null) {
			headPassed = n;
		}else {
			Node currFirst = headPassed;
			headPassed = n;
			n.next = currFirst;
		}
		return headPassed;
	}
	//headPassed
	public static Node appendToLast(Node n,Node headPassed) {
		if(headPassed == null) {
			headPassed =n;
		}else {
			Node first = headPassed;
			while(first.next != null) {
				first = first.next;
			}
			first.next = n;
		}
		return headPassed;
	}
	public static void appendToLast(Node n) {
		if(head == null) {
			head =n;
		}else {
			Node first = head;
			while(first.next != null) {
				first = first.next;
			}
			first.next = n;
		}
	}
	public static void printList() {
		Node pointer = head;
		while(pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	public static void printList(Node headPassed) {
		Node pointer = headPassed;
		while(pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	public static Node clone(Node n) {
		Node newClonedNode = null;
		while(n != null) {
			newClonedNode = appendToLast(new Node(n.data),newClonedNode);
			n = n.next;
		}
		return newClonedNode;
	}
}

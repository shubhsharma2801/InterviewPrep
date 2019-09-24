package LinkedList;

public class RemoveMiddleNode {
	static Node head = null;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public RemoveMiddleNode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		appendList(n1);
		Node n2 = new Node(2);
		appendList(n2);
		Node n3 = new Node(3);
		appendList(n3);
		Node n4 = new Node(4);
		appendList(n4);
		Node n5 = new Node(5);
		appendList(n5);
		//printList();
		n3.data = n3.next.data;
		n3.next = n3.next.next;
		System.out.println();
		printList();
	}

	private static void printList() {
		// TODO Auto-generated method stub
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	private static void appendList(Node n1) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = n1;
		}else {
			Node currentNode =head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = n1;
		}
	}
	
}

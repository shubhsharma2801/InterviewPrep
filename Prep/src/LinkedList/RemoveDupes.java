package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupes {
	static Node head = null;
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data =d;
			next = null;
		}
	}
	public RemoveDupes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Node end = new Node(20);
		appendNode(end);
		Node end1 = new Node(10);
		appendNode(end1);
		Node end2 = new Node(20);
		appendNode(end2);
		Node end3 = new Node(50);
		appendNode(end3);
		Node end4 = new Node(70);
		appendNode(end4);
		removeDupes(head);
		readList();
	}

	private static void removeDupes(Node head2) {
		// TODO Auto-generated method stub
		//with buffer
		/*Set<Integer> hashSet = new HashSet<Integer>(); 
		Node first = head;
		Node prev = null;
		while(first != null) {
			if(hashSet.contains(first.data)){
				prev.next =first.next;
			}else {
				hashSet.add(first.data);
			}
			prev = first;
			first = first.next;
		}*/
		//without buffer
		Node first = head;
		while(first != null) {
			Node runner = first;
			while(runner.next!= null) {
				if(runner.next.data == first.data) {
					runner.next=runner.next.next;
				}else {
					runner = runner.next;
				}
			}
			first =first.next;
		}
	}

	private static void readList() {
		// TODO Auto-generated method stub
		Node first = head;
		while(first != null) {
			System.out.println(first.data+"\t");
			first =first.next;
			
		}
	}

	private static void appendNode(Node end) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = end;
		}else {
			Node last = head;
			while(last.next != null) {
				last= last.next;
			}
			last.next = end;
		}
	}

}

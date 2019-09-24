package LinkedList;

import java.util.Stack;

public class Palindromeiterative {

	public Palindromeiterative() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(4);
		n.next.next.next = new Node(6);
		n.next.next.next.next = new Node(4);
		n.next.next.next.next.next = new Node(2);
		n.next.next.next.next.next.next = new Node(1);
		Boolean isPallindrome = checkPallindromeIterative(n);
		System.out.println(isPallindrome);
	}

	private static Boolean checkPallindromeIterative(Node n) {
		// TODO Auto-generated method stub
		Stack<Integer> stackList = new Stack<Integer>();
		Node slow = n;
		Node fast = n;
		 while(fast != null && fast.next != null) {
			 stackList.push(slow.data);
			 fast = fast.next.next;
			 slow = slow.next;
			 
			 //System.out.println(stackList);
		 }
		 //Node.printList(fast);
		 if(fast != null) {
			 slow = slow.next;
		 }
		 //System.out.println(stackList);
		 while(slow != null) {
			 int top = stackList.pop().intValue();
			 //System.out.println(slow.data+"\t"+top);
			 if(slow.data!=top) {
				 return false;
			 }
			 slow = slow.next;
		 }
		return true;
	}

}

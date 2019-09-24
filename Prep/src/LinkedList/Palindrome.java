package LinkedList;

public class Palindrome {
	static Node head = null;
	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(4);
		n.next.next.next = new Node(2);
		n.next.next.next.next = new Node(1);
		//Node.printList(n);
		Node revN = reverse(Node.clone(n));
		
		
		Boolean isPallindrome = checkPallindrome(n,revN);
		
		System.out.println(isPallindrome);
	}
	private static Boolean checkPallindrome(Node n, Node revN) {
		// TODO Auto-generated method stub
		while(n != null && revN !=null) {
			//System.out.println(n.data+" "+revN.data);
			if(n.data != revN.data) {
				return false;
			}
			n = n.next;
			revN = revN.next;
		}
		return true;
	}
	private static Node reverse(Node n) {
		// TODO Auto-generated method stub
		if(n.next == null) {
			head = n;
			return head;
		}
		//Node tempNode = 
		Node head = reverse(n.next);
		Node q = n.next;
		n.next = null;
		q.next = n;
		return head;
	}
}

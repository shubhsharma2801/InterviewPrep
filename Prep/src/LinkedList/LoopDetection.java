package LinkedList;

public class LoopDetection {

	public LoopDetection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node num1 = null;
		num1 = Node.appendToLast(new Node(1), num1);
		num1 = Node.appendToLast(new Node(2), num1);
		num1 = Node.appendToLast(new Node(3), num1);
		num1 = Node.appendToLast(new Node(4), num1);
		num1 = Node.appendToLast(new Node(5), num1);
		num1 =Node.appendToLast(num1.next.next, num1);
		
		//Node.printList(num1);
		Node n = getCorruptNode(num1);
		System.out.println(n.data);
	}

	private static Node getCorruptNode(Node num1) {
		// TODO Auto-generated method stub
		Node slow = num1;
		Node fast = num1;
		while(fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				break;
			}
		}
		if(fast== null || fast.next == null) {
			return null;
		}
		slow=num1;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		return fast;
	}

}

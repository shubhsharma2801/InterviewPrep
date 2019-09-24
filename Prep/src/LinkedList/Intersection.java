package LinkedList;

public class Intersection {

	public Intersection() {
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
		num1 = Node.appendToLast(new Node(6), num1);
		num1 = Node.appendToLast(new Node(7), num1);
		
		Node num2 = null;
		num2 = Node.appendToLast(new Node(8), num2);
		num2 = Node.appendToLast(new Node(9), num2);
		num2 = Node.appendToLast(new Node(10), num2);
		num2 = Node.appendToLast(new Node(11), num2);
		num2 = Node.appendToLast(num1.next.next.next, num2);
		System.out.println("-------------num1-------------");
		Node.printList(num1);
		System.out.println("-------------num2-------------");
		Node.printList(num2);
		System.out.println("-------------length-------------");
		System.out.println(legth(num1));
		System.out.println(legth(num2));
		if(legth(num1) >legth(num2)) {
			num1 = returnSkippedNode(num1,legth(num1)-legth(num2));
		}else if(legth(num1) <legth(num2)) {
			num2 = returnSkippedNode(num2,legth(num2)-legth(num1));
		}
		Node intersection = returnIntersection(num1,num2);
		System.out.println("-------------data-------------");
		System.out.println(intersection.data);
		//Node.printList(intersection);
	}
	private static Node returnIntersection(Node num1, Node num2) {
		// TODO Auto-generated method stub
		while(num1.next != null && num2.next!= null) {
			if(num1.next == num2.next) {
				return num1.next;
			}
			num1 = num1.next;
			num2 = num2.next;
		}
		return null;
	}

	private static int legth(Node num1) {
		// TODO Auto-generated method stub
		if(num1.next == null) {
			return 1;
		}
		return legth(num1.next)+1;
	}
	private static Node returnSkippedNode(Node n,int length) {
		for(int i=0;i<length;i++) {
			n = n.next;
		}
		return n;
	}
}

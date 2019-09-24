package LinkedList;

public class SumListForward {

	public SumListForward() {
		// TODO Auto-generated constructor stub
	}
	public static class CarryNodeWrapper{
		int carry;
		Node n;
		CarryNodeWrapper(){
			carry =0;
			n=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node num1 = null;
		Node num2 = null;
		num1 = Node.appendToLast(new Node(9), num1);
		num1 = Node.appendToLast(new Node(9), num1);
		num1 = Node.appendToLast(new Node(9), num1);
		
		//Node.printList(num1);
		System.out.println();
		num2 = Node.appendToLast(new Node(1), num2);
		
		//Node.printList(num2);
		add(num1,num2);
	}

	private static void add(Node num1, Node num2) {
		// TODO Auto-generated method stub
		int l1 = length(num1);
		int l2 = length(num2);
		//System.out.println(l2);
		
		if(l2>l1) {
			num1=appendZero(num1,l2-l1);
		}else {
			num2 = appendZero(num2,l1-l2);
		}
		CarryNodeWrapper cnw = recursiveAdd(num1,num2);
		//System.out.println(cnw);
		if(cnw.carry == 0) {
			Node.printList(cnw.n);
		}else {
			cnw.n = Node.appendToFirst(new Node(cnw.carry), cnw.n);
			Node.printList(cnw.n);
		}
		
	}

	private static CarryNodeWrapper recursiveAdd(Node num1, Node num2) {
		// TODO Auto-generated method stub
		//CarryNodeWrapper result = new CarryNodeWrapper();
		if(num1 == null && num2 == null) {
			return new CarryNodeWrapper();
		}
		//System.out.println("jj");
		CarryNodeWrapper temp1 = recursiveAdd(num1.next,num2.next);
		
		int val = temp1.carry + num1.data + num2.data;
		
		Node n = appendToFirst(temp1.n, val%10);
		temp1.n = n;
		temp1.carry = val/10;
		return temp1;
	}

	private static Node appendToFirst(Node n, int i) {
		Node temp = new Node(i);
		if(n != null) {
			temp.next = n;
			//System.out.println("jjj");
		}
		return temp;
	}

	private static Node appendZero(Node num1, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			num1 = Node.appendToFirst(new Node(0),num1);
		}
		return num1;
	}

	private static int length(Node num1) {
		// TODO Auto-generated method stub
		if(num1.next == null) {
			return 1;
		}
		return length(num1.next)+1;
	}

}

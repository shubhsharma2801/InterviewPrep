package LinkedList;

public class SumList {

	public SumList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node num1 = null;
		Node num2 = null;
		num1 = Node.appendToLast(new Node(9), num1);
		num1 = Node.appendToLast(new Node(7), num1);
		num1 = Node.appendToLast(new Node(8), num1);
		//Node.printList(num1);
		System.out.println();
		num2 = Node.appendToLast(new Node(6), num2);
		num2 = Node.appendToLast(new Node(8), num2);
		num2 = Node.appendToLast(new Node(5), num2);
		//Node.printList(num2);
		
		addReverse(num1,num2);
	}

	private static void addReverse(Node num1, Node num2) {
		// TODO Auto-generated method stub
		Node result = null;
		Node temp1 = num1;
		Node temp2 = num2;
		result = addReverseWithCarry(num1,num2,0);
		Node.printList(result);
	}

	private static Node addReverseWithCarry(Node num1, Node num2, int carry) {
		// TODO Auto-generated method stub
		//carry can also be carry forwarde even if both num1 and num2 is null
		if(num1 == null && num2==null && carry==0 ) {
			return null;
		}
		Node result = new Node(0);
		int val =carry;
		if(num1!= null) {
			val+=num1.data;
		}
		if(num2 != null) {
			val+= num2.data;
		}
		result.data = val%10;
		System.out.println("--------------Result------------------");
		Node.printList(result);
		System.out.println("--------------Result------------------");
		System.out.println("carry" +carry);
		//recurse
		if(num1 != null || num2 != null) {
			Node more = addReverseWithCarry(num1 == null?null:num1.next,num2 == null?null :num2.next,val>=10 ?1:0);
			
			System.out.println("--------------more------------------");
			Node.printList(more);
			System.out.println("--------------more------------------");
			
			//result.appendToLast(more);
			Node result1= result;
			while(result1.next != null) {
				result1 = result1.next;
			}
			result1.next = more;
			System.out.println("--------------Result after------------------");
			Node.printList(result);
			System.out.println("--------------Result after------------------");
		}
		
		return result;
		
	}

}

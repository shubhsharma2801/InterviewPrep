package LinkedList;

public class PalindromeRecursive {

	public PalindromeRecursive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node num1 = null;
		num1 = Node.appendToLast(new Node(1), num1);
		num1 = Node.appendToLast(new Node(2), num1);
		num1 = Node.appendToLast(new Node(3), num1);
		num1 = Node.appendToLast(new Node(8), num1);
		num1 = Node.appendToLast(new Node(3), num1);
		num1 = Node.appendToLast(new Node(8), num1);
		num1 = Node.appendToLast(new Node(1), num1);
		int length = legth(num1);
		//System.out.println(length);
		 Result res =checkPallindromeRecursive(num1,length);
		 System.out.println(res.check);
	}

	private static int legth(Node num1) {
		// TODO Auto-generated method stub
		if(num1.next == null) {
			return 1;
		}
		return legth(num1.next)+1;
	}

	private static Result checkPallindromeRecursive(Node num1, int length) {
		if(length == 0 ) {
			//System.out.println(num1.data);
			return new Result(true,num1);
		}else if(length == 1) {
			return new Result(true,num1.next);
		}
		Result res = checkPallindromeRecursive(num1.next,length-2);
		//System.out.println(num1.data);
		System.out.println(res.nextNode.data+" "+num1.data);
		if(num1.data == res.nextNode.data) {
			res.nextNode =res.nextNode.next;
			res.check =true;
			return res;
		}else {
			res.check =false;
			return res;
		}
		//return res;
	}
	static class Result{
		Boolean check;
		Node nextNode;
		public Result(Boolean check,Node nextNode) {
			this.check = check;
			this.nextNode = nextNode;
		}
	}
}

package LinkedList;

public class Partition {
	
	public Partition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node.appendToLast(new Node(3));
		Node.appendToLast(new Node(5));
		Node.appendToLast(new Node(8));
		Node.appendToLast(new Node(5));
		Node.appendToLast(new Node(10));
		Node.appendToLast(new Node(2));
		Node.appendToLast(new Node(1));
		//Node.printList();
		//System.out.println(Node.head.data);
		//partion(1);
		partionSecondMethod(5);
	}

	private static void partionSecondMethod(int i) {
		// TODO Auto-generated method stub
		Node headPassed = null;
		Node lower = null;
		Node curr = Node.head;
		while(curr != null) {
			Node next = curr.next;
			curr.next =  null;
			if(curr.data < i) {
				//System.out.println("here");
				headPassed =Node.appendToFirst(curr, headPassed);
				//lower =Node.appendToFirst(curr, headPassed);
			}else {
				System.out.println("here");
				headPassed = Node.appendToLast(curr, headPassed);
			}
			curr = next;
		}
		System.out.println(headPassed);
		Node.printList(headPassed);
	}

	private static void partion(int i) {
		// TODO Auto-generated method stub
		Node firstGreater =null;
		Node endLower = null;
		Node lowerHead = null;
		Node greaterHead = null;
		Node curr = Node.head;
		while(curr != null) {
			Node next = curr.next;
			curr.next = null;
			if(curr.data<i) {
				//append to lowerHead
				if(lowerHead == null) {
					lowerHead = curr;
					endLower = curr;
				}else {
					Node temp = lowerHead;
					while(temp.next != null) {
						temp = temp.next;
					}
					temp.next = curr;
					endLower =curr;
				}
			}else {
				if(greaterHead == null) {
					greaterHead = curr;
				}else {
					Node temmp1 = greaterHead;
					while(temmp1.next != null) {
						temmp1 = temmp1.next;
					}
					temmp1.next = curr;
				}
			}
			curr = next;
		}
		if(lowerHead == null) {
			Node.printList(greaterHead);
		}else {
			endLower.next = greaterHead;
			Node.printList(lowerHead);
		}
		
	}

}

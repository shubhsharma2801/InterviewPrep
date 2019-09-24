package TreeGraphs;

public class InOrderSuccessor {
	static class Node{
		int data;
		Node left,right,parent;
		Node(int data){
			this.data = data;
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
		
		
	}
	//Node root;
	public InOrderSuccessor() {
		// TODO Auto-generated constructor stub
	}
	public static Node insert(Node root,int data) {
		//System.out.println("here");
		if(root == null) {
			//System.out.println("here exit");
			return new Node(data);
		}else {
			//System.out.println("here left");
			Node temp = null;
			if(data <=root.data) {
				 temp = insert(root.left,data);
				 root.left = temp;
				 temp.parent = root;
				
			}else {
				temp = insert(root.right,data);
				root.right = temp;
				temp.parent = root;	
			}
			return root;
		}
		
	}
	public static void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
        printPreorder(node.left); 
        System.out.print(node.data + " "); 
        printPreorder(node.right); 
    } 
	public static  Node inorderSuccessor(Node n) {
		if(n == null) {
			return null;
		}
		if(n.right != null) {
			return leftMostChild(n.right);
		}else {
			System.out.println("here");
			Node q = n;
			Node x = q.parent;
			while(q != null && x.left != q) {
				q = x;
				x= x.parent;
			}
			return x;
		}
		
	}
	private static Node leftMostChild(Node node) {
		if(node == null) {
			return null;
		}
		System.out.println(node.data);
		// TODO Auto-generated method stub
		while(node.left != null) {
			node = node.left;
			System.out.println("leftMost");
		}
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		//Node temp = null, suc = null, min = null; 
		Node suc = null,temp= null;
        root = insert(root, 20); 
        root = insert(root, 8); 
        root = insert(root, 22); 
        root = insert(root, 4); 
        root = insert(root, 12); 
        root = insert(root, 10); 
        root = insert(root, 14); 
        printPreorder(root);
        temp = root.left.right.left; 
        System.out.println(temp.right);
        suc = inorderSuccessor(temp); 
        if (suc != null) { 
            System.out.println("Inorder successor of " + temp.data +  
                                                      " is " + suc.data); 
        } else { 
            System.out.println("Inorder successor does not exist"); 
        }
        //temp = root.left.right.right;
	}

}

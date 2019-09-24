package TreeGraphs;

import TreeGraphs.ListOfDepth.Node;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(5); 
	    root.left.left = new Node(3); 
	    root.left.right = new Node(4); 
	    root.right.right = new Node(6);
	    Boolean isBST= validateBST(root,null,null);
	    System.out.println(isBST);
	}

	private static Boolean validateBST(Node root, Integer min, Integer max) {
		// TODO Auto-generated method stub
		if(root == null) {
			return true;
		}
		if(root.data>min || root.data<max ) {
			return false;
		}
		if(!validateBST(root.left,min,root.data) || !validateBST(root.right,root.data,max)) {
			return false;
		}
		return true;
	}

}

package TreeGraphs;

import TreeGraphs.ListOfDepth.Node;

public class CheckBalanced {

	public CheckBalanced() {
		// TODO Auto-generated constructor stub
	}
	static class TreeWrapper{
		int height;
		boolean isBalanced;
		public TreeWrapper(int height, Boolean isBalanced) {
			this.height = height;
			this.isBalanced = isBalanced;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(5); 
	    root.left.left = new Node(3); 
	    root.left.right = new Node(4); 
	    root.right.right = new Node(6);
	    checkBalanced(root);
	    System.out.println(checkBalancedOptimized(root));
	    System.out.println(checkBalanced(root).isBalanced);
	}

	private static TreeWrapper checkBalanced(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new TreeWrapper(-1,true);
		}
		TreeWrapper leftHeight = checkBalanced(root.left);
		TreeWrapper rightHeight = checkBalanced(root.right);
		int diffheight = leftHeight.height > rightHeight.height ? leftHeight.height- rightHeight.height:rightHeight.height -leftHeight.height;
		TreeWrapper result;
		if(diffheight > 1) {
			 result = new TreeWrapper(leftHeight.height > rightHeight.height ?leftHeight.height+1:rightHeight.height+1,false);
		}else {
			result = new TreeWrapper(leftHeight.height > rightHeight.height ?leftHeight.height+1:rightHeight.height+1,true);
		}
		return result;
	}
	private static int checkBalancedOptimized(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return -1;
		}
		int leftHeight = checkBalancedOptimized(root.left);
		int rightHeight = checkBalancedOptimized(root.right);
		int diffheight = Math.abs(leftHeight - rightHeight) ;
		int result;
		if(diffheight > 1) {
			 result =Integer.MIN_VALUE;
		}else {
			result = Math.max(leftHeight, rightHeight)+1;
		}
		return result;
	}
}

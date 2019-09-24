package TreeGraphs;

public class Tree {
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	public static TreeNode root;
	public static TreeNode getNewNode(int data) {
		return new TreeNode(data);
	}
	public static TreeNode insert(TreeNode root,int data) {
		if(root == null) {
			root = getNewNode(data);
		}else if(data < root.data) {
			root.left = insert(root.left,data);
		}else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public static Boolean isPresent(TreeNode root,int data) {
		if(root == null) {
			return false;
		}
		else if(data == root.data) {
			return true;
		}else if(data<root.data){
			return isPresent(root.left,data);
		}else {
			return isPresent(root.right,data);
		}
	}
	public static void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	public static void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}else {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
			
		}
	}
	public static void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}else {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	public static int findMin(TreeNode root) {
		
		if(root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root.data;
	}
	public static int findMaxRecursive(TreeNode root) {
		
		if(root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		else if(root.right == null) {
			return root.data;
		}
		return findMaxRecursive(root.right);
	}
	public static int findHeight(TreeNode root) {
		if(root == null) {
			return -1;
		}else {
			return Math.max(findHeight(root.left), findHeight(root.right))+1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = insert(root,1);
		root = insert(root,2);
		root = insert(root,3);
		root = insert(root,4);
		root = insert(root,5);
		root = insert(root,6);
		root = insert(root,7);
		root = insert(root,8);
		System.out.println(findHeight(root));
//		System.out.println("inOrder");
//		inOrder(root);
//		insert(root,12);
//		System.out.println("inOrder after insert");
//		inOrder(root);
		
	}

}

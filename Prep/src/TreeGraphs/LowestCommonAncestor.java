package TreeGraphs;
import java.util.*;
public class LowestCommonAncestor {
	static Node root;
	public static class Result {
		Node node;
		Boolean isFound;
		public Result(Node node,Boolean isFound) {
			this.node = node;
			this.isFound = isFound;
		}
	}
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static Result lowestCommonAncestor(Node root,int a,int b) {
		if(root == null) {
			return new Result(null,false);
		}
		if(root.data == a || root.data == b) {
			return new Result(root,true);
		}
		Result right = lowestCommonAncestor(root.right,a,b);
		Result left = lowestCommonAncestor(root.left,a,b);
		if(right.node != null && left.node != null) {
			return new Result(root,true);
		}
		else {
			return new Result(right.node!= null ? right.node :left.node,false);
		}
		//return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        System.out.println("LCA(4, 5) = " + 
        		lowestCommonAncestor(root,4, 5).node.data); 
		System.out.println("LCA(4, 6) = " + 
				lowestCommonAncestor(root,4, 6).node.data); 
		System.out.println("LCA(3, 4) = " + 
				lowestCommonAncestor(root,3, 4).node.data); 
		System.out.println("LCA(2, 4) = " + 
				lowestCommonAncestor(root,2, 4).node.data);
	}

}

package TreeGraphs;
import java.util.*;
public class ListOfDepth {
	static class Node {
		int data;
		Node left,right;
		Node(int data){
			this.data =data;
			
		}
	}
	public ListOfDepth() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 
        /   \ 
       2     5 
      / \     \ 
     3   4     6 */
	ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
	
    Node root = new Node(4); 
    root.left = new Node(2); 
    root.right = new Node(5); 
    root.left.left = new Node(3); 
    root.left.right = new Node(4); 
    root.right.right = new Node(6);
    result= createDepthList(root,result,0);
    for(LinkedList<Node> n1 : result) {
    		for(Node n:n1) {
    			System.out.print(n.data+"  ");
    		}
    		System.out.println();
    }
	}

	private static ArrayList<LinkedList<Node>> createDepthList(Node root, ArrayList<LinkedList<Node>> result, int level) {
		// TODO Auto-generated method stub
		if(root== null) {
			return null;
		}
		LinkedList<Node> list = null;
		if(level == result.size()) {
			list = new LinkedList<Node>();
			result.add(list);
		}else {
			list = result.get(level);
		}
		list.add(root);
		
		createDepthList(root.left,result,level+1);
		createDepthList(root.right,result,level+1);
		return result;
	}

}

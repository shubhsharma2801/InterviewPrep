package TreeGraphs;

public class MinimalBST {
	static class Node {
		int data;
		Node left,right;
		Node (int data){
			this.data =data;
		}
	}
	public MinimalBST() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8};
		Node root =createMinimalBST(arr);
		preOrder(root);
	}
	private static void preOrder(Node root) {
		if(root == null) {
			return ;
		}
		// TODO Auto-generated method stub
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	private static Node createMinimalBST(int[] arr) {
		// TODO Auto-generated method stub
		return createMinimalBST(arr,0,arr.length-1);
	}
	private static Node createMinimalBST(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		System.out.println("start "+start);
		if(start > end) {
			return null;
		}
		int mid = (start+end)/2;
		System.out.println(mid);
		Node n = new Node(arr[mid]);
		n.left = createMinimalBST(arr,start,mid-1);
		n.right = createMinimalBST(arr, mid+1, end);
		return n;
	}
}

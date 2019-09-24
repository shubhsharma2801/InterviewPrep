package TreeGraphs;
import java.util.*;
public class Graph {
	public HashMap<Integer,Node> map = new HashMap<Integer,Node>();
	public LinkedList<Node> nodes= new LinkedList<Node>();
	public static class Node{
		int id;
		int data;
		LinkedList<Node> adj = new LinkedList<Node>();
		public Node(int id,int data) {
			this.id = id;
			this.data = data;
		}
	}
	private Node getNode(int id,int data) {
		if(!map.containsKey(id)) {
			Node n = new Node(id,data);
			nodes.add(n);
			map.put(id, n);
		}
		return map.get(id);
	}
	private void addEdge(int source,int dest,int data) {
		Node s =getNode(source,data);
		Node des = getNode(dest,data);
		s.adj.add(des);
		//des.adj.add(s);
	}
	public LinkedList<Node> getNodes() {
		return nodes;
	}
	public void dfs(int source) {
		Node s = getNode(source,1);
		HashSet<Integer> visited = new HashSet<Integer>();
		dfs(s,visited);
	}
	private void dfs(Node s, HashSet<Integer> visited) {
		// TODO Auto-generated method stub
		if(visited.contains(s.id)) {
			return;
		}
		System.out.println(s.id);
		visited.add(s.id);
		for(Node n :s.adj) {
			dfs(n,visited);
		}
	}
	public void bfs(int source) {
		HashSet<Integer> visited = new HashSet<Integer>();
		bfs(getNode(source,1),visited);
	}
	private void bfs(Node node, HashSet<Integer> visited) {
		// TODO Auto-generated method stub
		LinkedList<Node> queue = new LinkedList<Node>();
		visited.add(node.id);
		queue.add(node);
		while(!queue.isEmpty()) {
			Node s = queue.remove();
			System.out.println(s.id);
			for(Node n : s.adj) {
				if(!visited.contains(n.id)) {
					queue.add(n);
					visited.add(n.id);
				}
				
			}
		}
	}
	public Graph() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addEdge(0, 1, 12);
		g.addEdge(0, 4, 1);
		g.addEdge(1, 2, 1);
		g.addEdge(1, 3, 1);
		g.addEdge(1, 4, 1);
		g.addEdge(2, 3, 1);
		g.addEdge(2, 4, 1);
		for(Node n : g.getNodes()){
			System.out.print("Vertex " + n.id + " is connected to: ");
			for(Node n1 :n.adj) {
				System.out.print(n1.id + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------BFS------------------");
		g.bfs(0);
	}

}

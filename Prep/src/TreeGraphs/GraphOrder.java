package TreeGraphs;
import java.util.*;

import TreeGraphs.Graph.Node;
import TreeGraphs.GraphOrder.Project;
public class GraphOrder {
	Map<String,Project> map = new HashMap<String,Project>();
	LinkedList<Project> node = new LinkedList<Project>();
	static class Project{
		String name;
		LinkedList<Project> adj;
		public Project(String name) {
			this.name = name;
			adj = new LinkedList<Project>();
		}
	}
	public static class Graph{
		Project p;
		LinkedList<Project> adj;
		
	}
	public Project getOrCreateProject(String name) {
		if(map.containsKey(name)) {
			return map.get(name);
		}else {
			Project p = new Project(name);
			node.add(p);
			map.put(name, p);
			return p;
		}
		
	}
	public void addEdge(String s,String d) {
		Project source = getOrCreateProject(s);
		Project des = getOrCreateProject(d);
		source.adj.add(des);
	}
	public LinkedList<Project> getNodes(){
		return node;
	}
	public GraphOrder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphOrder g = new GraphOrder();
		g.addEdge("a", "d");
		g.addEdge("f", "b");
		g.addEdge("b", "d");
		g.addEdge("f", "a");
		g.addEdge("d", "c");
		for(Project n : g.getNodes()){
			System.out.print("Vertex " + n.name + " is connected to: ");
			for(Project n1 :n.adj) {
				System.out.print(n1.name + " ");
			}
			System.out.println();
		}
		g.topologicalSort();
	}
	private void topologicalSort() {
		// TODO Auto-generated method stub
		
		Stack<Project> stack = new Stack<Project>();
		Set<String> visited = new HashSet<String>();
		for(Project p : getNodes()) {
			if(!visited.contains(p.name)) {
				topologicalSortUtil(stack,visited,p);
			}
		}
		//System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().name);
		}
	}
	private void topologicalSortUtil(Stack<Project> stack, Set<String> visited, Project p) {
		// TODO Auto-generated method stub
		visited.add(p.name);
		for(Project p_adj : p.adj) {
			if(!visited.contains(p_adj.name)) {
				topologicalSortUtil(stack, visited, p_adj);
			}
		}
		stack.push(p);
	}

}

package info.kolegov.graph;

import org.junit.Before;
import org.junit.Test;

import info.kolegov.datastructure.Graph;

public class GraphAlgorithmsTest {

	private Graph graph = new Graph();
	private Graph graph2 = new Graph();
	
	@Before
	public void before() {
		graph.addVertex('A'); // 0
		graph.addVertex('B'); // 1
		graph.addVertex('C'); // 2
		graph.addVertex('D'); // 3
		graph.addVertex('E'); // 4
		graph.addEdge(0, 1); // AB
		graph.addEdge(1, 2); // BC
		graph.addEdge(0, 3); // AD
		graph.addEdge(3, 4); // DE
		//	Graph visualization:
		//
		//	C---B---A---D---E
		
		graph2.addVertex('A'); // 0
		graph2.addVertex('B'); // 1
		graph2.addVertex('C'); // 2
		graph2.addVertex('D'); // 3
		graph2.addVertex('E'); // 4
		graph2.addEdge(0, 1); // AB
		graph2.addEdge(0, 2); // AC
		graph2.addEdge(0, 3); // AD
		graph2.addEdge(0, 4); // AE
		graph2.addEdge(1, 2); // BC
		graph2.addEdge(1, 3); // BD
		graph2.addEdge(1, 4); // BE
		graph2.addEdge(2, 3); // CD
		graph2.addEdge(2, 4); // CE
		graph2.addEdge(3, 4); // DE
		
	}

	@Test
	public void testBreadthFirstSearch() {
		System.out.println("\nVisits: ");
		// distance from A vertex to others vertexes
		BreadthFirstSearcher.bfs(graph, 0);
	}

	@Test
	public void testDepthFirstSearch() {
		System.out.println("\nVisits: ");
		// distance from C vertex to others vertexes
		DepthFirstSearcher.dfs(graph, 2);
		System.out.println("\nVisits: ");
		// distance from C vertex to others vertexes
		DepthFirstSearcher.recursiveDFS(graph, 2);
		graph.reset();
	}

	@Test
	public void testMST() {
		System.out.println("\nEdges: ");
		// distance from A vertex to others vertexes
		MinimumSpanningTree.mst(graph2, 0);
	}
}
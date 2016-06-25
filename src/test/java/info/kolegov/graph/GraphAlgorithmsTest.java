package info.kolegov.graph;

import org.junit.Before;
import org.junit.Test;

import info.kolegov.datastructure.Graph;

public class GraphAlgorithmsTest {

	private Graph graph = new Graph();
	
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
	}

	@Test
	public void testBreadthFirstSearch() {
		System.out.println("Visits: ");
		// distance from A vertex to others vertexes
		BreadthFirstSearcher.bfs(graph, 0);
	}

	@Test
	public void testDepthFirstSearch() {
		System.out.println("Visits: ");
		// distance from C vertex to others vertexes
		DepthFirstSearcher.dfs(graph, 2);
		System.out.println("Visits: ");
		// distance from C vertex to others vertexes
		DepthFirstSearcher.recursiveDFS(graph, 2);
		graph.reset();
	}
}
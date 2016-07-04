package info.kolegov.graph;

import java.util.Stack;

import info.kolegov.datastructure.Graph;

public class MinimumSpanningTree {

	/**
	 * Minimum Spanning Tree algorithm based on Depth First Search (DFS) algorithm.
	 * MST also could be based on BFS.
	 * @param g
	 * @param v
	 */
	public static void mst(Graph g, int v) {
		Stack<Integer> theStack = new Stack<>();
		g.getVertex(v).setVisited(true);
		theStack.push(v);
		while( !theStack.isEmpty() ) { // Извлечение элемента из стека
			int currentVertex = theStack.peek();
			// get next unvisited neighbor
			int next = g.getAdjUnvisitedVertex(currentVertex);
			if(next == -1) {
				theStack.pop(); // извлечь элемент из стека
			} else {
				g.getVertex(next).setVisited(true);
				theStack.push(next);
				g.displayEdge(currentVertex, next);
			}
		}
		g.reset();
	}
}

package info.kolegov.graph;

import java.util.Stack;

import info.kolegov.datastructure.Graph;


public class DepthFirstSearcher {

	public static void dfs(Graph g, int v) {
		Stack<Integer> theStack = new Stack<>();
		g.getVertex(v).setVisited(true);
		g.displayVertex(v);
		theStack.push(v);
		while( !theStack.isEmpty() ) {
			int current = theStack.peek();
			int next = g.getAdjUnvisitedVertex(current);
			if(next == -1) {
				theStack.pop();
			} else {
				g.getVertex(next).setVisited(true);
				g.getVertex(next).setDistance(g.getVertex(current).getDistance()+1);
				g.displayVertex(next);
				theStack.push(next);
			}
		}
		g.reset();
	}

	public static void recursiveDFS(Graph g, int v) {
		g.getVertex(v).setVisited(true);
		g.displayVertex(v);
		int w;
		while ((w = g.getAdjUnvisitedVertex(v)) != -1) {
			if (!g.getVertex(w).wasVisited()) {
				g.getVertex(w).setDistance(g.getVertex(v).getDistance()+1);
				recursiveDFS(g, w);
			}
		}
	}
}

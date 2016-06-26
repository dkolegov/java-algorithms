package info.kolegov.graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import info.kolegov.datastructure.Graph;

public class BreadthFirstSearcher {

	public static void bfs(Graph g, int root) {
		Queue<Integer> theQueue = new LinkedList<>();
		g.getVertex(root).setVisited(true);
		g.displayVertex(root);
		theQueue.add(root);
		int v2;
		while(!theQueue.isEmpty() ) {
			int v1 = theQueue.remove();
			while( (v2=g.getAdjUnvisitedVertex(v1)) != -1 ) {
				g.getVertex(v2).setVisited(true);
				g.getVertex(v2).setDistance(g.getVertex(v1).getDistance() + 1);
				g.displayVertex(v2);
				theQueue.add(v2);
			}
		}
		g.reset();
	}
}

package info.kolegov.datastructure;

public class Graph {

	public class Vertex {
		private char label;
		private boolean wasVisited = false;
		private int distance = 0;

		public Vertex(char label) {
			this.label = label;
		}

		public boolean wasVisited() {
			return wasVisited;
		}

		public void setVisited(boolean v) {
			wasVisited = v;
		}

		public void setDistance(int d) {
			distance = d;
		}

		public char getLabel() {
			return label;
		}

		public int getDistance() {
			return distance;
		}
	}

	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][]; // Adjacency matrix
	private int nVerts; // Current count of vertexes

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		// Adjacency matrix
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++) {// Adjacency matrix
			for(int k=0; k<MAX_VERTS; k++) {// init with 0's
				adjMat[j][k] = 0;
			}
		}
	}

	public int getNVerts() {
		return nVerts;
	}

	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}

	public Vertex getVertex(int i) {
		return vertexList[i];
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	// returns unvisited adjacent vertex
	public int getAdjUnvisitedVertex(int v) {
		for(int j=0; j<nVerts; j++) {
			if (adjMat[v][j]==1 && vertexList[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public void displayVertex(int v) {
		System.out.printf("V%s{lable: %s, distance: %s}", v, vertexList[v].label, vertexList[v].distance);
		System.out.println();
	}

	public void reset() {
		for(int j=0; j<getNVerts(); j++) {
			getVertex(j).setVisited(false);
			getVertex(j).setDistance(0);
		}
	}
}

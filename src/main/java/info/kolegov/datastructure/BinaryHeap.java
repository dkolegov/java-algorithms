package info.kolegov.datastructure;

public class BinaryHeap {

    public static int iParent(int i) {
		return Math.floorDiv((i-1), 2);
	}

    public static int iLeftChild(int i) {
		return 2*i + 1;
	}

    public static int iRightChild(int i) {
    	return 2*i + 2;
    }
}

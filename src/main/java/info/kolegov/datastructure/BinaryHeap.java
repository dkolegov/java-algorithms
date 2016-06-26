package info.kolegov.datastructure;

/**
 * a balanced binary heap: the two children of heap[n] are heap[2*n+1] and heap[2*(n+1)].
 * See also {@linkplain java.util.PriorityQueue}
 * @author Dmitry
 *
 */
public class BinaryHeap {

    public static int iParent(int i) {
		return (i - 1) >>> 1; // equivalent of (i-1)/2 or Math.floorDiv((i-1), 2)
	}

    public static int iLeftChild(int i) {
		return (i << 1) + 1; // equivalent of 2*i + 1
	}

    public static int iRightChild(int i) {
    	return (i << 1) + 2; // equivalent of 2*i + 2
    }
}

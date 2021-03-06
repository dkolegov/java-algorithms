package info.kolegov.sort.heapsort;

import java.util.Comparator;

import info.kolegov.array.ArrayUtils;
import info.kolegov.datastructure.BinaryHeap;
import info.kolegov.sort.Sorter;

public class SiftDownHeapsorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		int count = list.length;
		 
	    //(Build the heap in array a so that largest value is at the root)
	    heapify(list, c);
	
	    //(The following loop maintains the invariants that a[0:end] is a heap and every element
	    // beyond end is greater than everything before it (so a[end:count] is in sorted order))
	    int end = count - 1;
	    while (end > 0) {
	        //(a[0] is the root and largest value. The swap moves it in front of the sorted elements.)
	        ArrayUtils.swap(list, end, 0);
	        //(the heap size is reduced by one)
	        end--;
	        //(the swap ruined the heap property, so restore it)
	        siftDown(list, 0, end, c);
	    }
	}
  
    /**
     * (Put elements of 'list' in heap order, in-place)
     */
    private <T> void heapify(Object[] list, Comparator<? super T> c) {
        int count = list.length;
    	//(start is assigned the index in 'a' of the last parent node)
        //(the last element in a 0-based array is at index count-1; find the parent of that element)
        int start = BinaryHeap.iParent(count-1);
        
        while (start >= 0) {
            //(sift down the node at index 'start' to the proper place such that all nodes below
            // the start index are in heap order)
            siftDown(list, start, count - 1, c);
            //(go to the next parent node)
            start--;
        }//(after sifting down the root all nodes/elements are in heap order)
    }

	/**
     * (Repair the heap whose root element is at index 'start', assuming the heaps rooted at its children are valid)
     * @param list
     * @param start
     * @param end
     */
    private <T> void siftDown(Object[] list, int start, int end, Comparator<? super T> c) {
        int root = start;
        int child, swap;
        while (BinaryHeap.iLeftChild(root) <= end) { 	//(While the root has at least one child)
        	child = BinaryHeap.iLeftChild(root);  	//(Left child of root)
            swap = root;                //(Keeps track of child to swap with)

            if (compare(list[swap], list[child], c) < 0) {
            	swap = child;
            }
                
            //(If there is a right child and that child is greater)
            if (child+1 <= end && compare(list[swap], list[child+1], c) < 0) {
                swap = child + 1;
            }
            if (swap == root) {
                //(The root holds the largest element. Since we assume the heaps rooted at the
                // children are valid, this means that we are done.)
                return;
            } else {
            	ArrayUtils.swap(list, root, swap);
                root = swap;            //(repeat to continue sifting down the child now)
            }
        }
    }

}

package info.kolegov.sort.heapsort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import info.kolegov.datastructure.BinaryHeap;
import info.kolegov.sort.Sorter;

public class SiftUpHeapsorter implements Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		heapsort(list);
	}

	/**
	 * 
	 * @param list an unordered list
	 */
	private <T extends Comparable<? super T>> void heapsort(List<T> list) {
		int count = list.size();
 
	    //(Build the heap in array a so that largest value is at the root)
	    heapify(list, count);
	
	    int end = count - 1;
	    while (end > 0) {
	        //(list[0] is the root and largest value. The swap moves it in front of the sorted elements.)
	        Collections.swap(list, end, 0);

	        heapify(list, end);
	        end--;
	    }
	}
        
    /**
     * (Put elements of 'list' in heap order, in-place)
     */
    private <T extends Comparable<? super T>> void heapify(List<T> list, int count) {
    	//(end is assigned the index of the first (left) child of the root)
        int end = 1;
        
        while (end < count) {
            //(sift up the node at index end to the proper place such that all nodes above
            // the end index are in heap order)
            siftUp(list, 0, end);
            end++;
        }
        //(after sifting up the last node all nodes are in heap order)
    }

    /**
     * 
     * @param list
     * @param start represents the limit of how far up the heap to sift.
     * @param end is the node to sift up.
     */
    private <T extends Comparable<? super T>> void siftUp(List<T> list, int start, int end) {
		int child = end; 
		while (child > start) {
			int parent = BinaryHeap.iParent(child);
			if (list.get(parent).compareTo(list.get(child)) < 0) { //(out of max-heap order)
				Collections.swap(list, parent, child);
				child = parent; //(repeat to continue sifting up the parent now)
			} else {
				return;
			}
		}
	}

	public <T> void sort(List<T> list, Comparator<? super T> c) {
		heapsort(list, c);
	}


	/**
	 * 
	 * @param list an unordered list
	 */
	private <T> void heapsort(List<T> list, Comparator<? super T> c) {
		int count = list.size();
 
	    //(Build the heap in array a so that largest value is at the root)
	    heapify(list, count, c);
	
	    int end = count - 1;
	    while (end > 0) {
	        //(list[0] is the root and largest value. The swap moves it in front of the sorted elements.)
	        Collections.swap(list, end, 0);

	        heapify(list, end, c);
	        end--;
	    }
	}
        
    /**
     * (Put elements of 'list' in heap order, in-place)
     */
    private <T> void heapify(List<T> list, int count, Comparator<? super T> c) {
    	//(end is assigned the index of the first (left) child of the root)
        int end = 1;
        
        while (end < count) {
            //(sift up the node at index end to the proper place such that all nodes above
            // the end index are in heap order)
            siftUp(list, 0, end, c);
            end++;
        }
        //(after sifting up the last node all nodes are in heap order)
    }

    /**
     * 
     * @param list
     * @param start represents the limit of how far up the heap to sift.
     * @param end is the node to sift up.
     */
    private <T> void siftUp(List<T> list, int start, int end, Comparator<? super T> c) {
		int child = end; 
		while (child > start) {
			int parent = BinaryHeap.iParent(child);
			if (c.compare(list.get(parent), list.get(child)) < 0) { //(out of max-heap order)
				Collections.swap(list, parent, child);
				child = parent; //(repeat to continue sifting up the parent now)
			} else {
				return;
			}
		}
	}
}

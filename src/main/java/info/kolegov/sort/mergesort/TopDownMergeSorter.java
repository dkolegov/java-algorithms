package info.kolegov.sort.mergesort;

import java.util.Comparator;

import info.kolegov.sort.Sorter;

public class TopDownMergeSorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		Object[] tmp = new Object[list.length];
		topDownSplitMerge(list, 0, list.length, tmp, c);
	}

	// iBegin is inclusive; iEnd is exclusive (A[iEnd] is not in the set).
	private <T> void topDownSplitMerge(Object[] A, int iBegin, int iEnd, Object[] B, Comparator<? super T> c) {
	    if(iEnd - iBegin < 2)                       // if run size == 1
	        return;                                 //   consider it sorted
	    // recursively split runs into two halves until run size == 1,
	    // then merge them and return back up the call chain
	    int iMiddle = (iEnd + iBegin) / 2;              // iMiddle = mid point
	    topDownSplitMerge(A, iBegin,  iMiddle, B, c);  // split / merge left  half
	    topDownSplitMerge(A, iMiddle,    iEnd, B, c);  // split / merge right half
	    topDownMerge(A, iBegin, iMiddle, iEnd, B, c);  // merge the two half runs
	    copy(B, iBegin, iEnd, A);              // copy the merged runs back to A
	}

	//  Left half is A[iBegin:iMiddle-1].
	// Right half is A[iMiddle:iEnd-1   ].
	private <T> void topDownMerge(Object[] A, int iBegin, int iMiddle, int iEnd, Object[] B, Comparator<? super T> c) {
	    int i = iBegin, j = iMiddle;
	    
	    // While there are elements in the left or right runs...
	    for (int k=iBegin; k<iEnd; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i < iMiddle && (j >= iEnd || compare(A[i], A[j], c) <= 0)) {
	            B[k] = A[i];
	            i = i + 1;
	        } else {
	            B[k] = A[j];
	            j = j + 1;    
	        }
	    } 
	}

	private void copy(Object[] B, int iBegin, int iEnd, Object[] A)
	{
	    for(int k = iBegin; k < iEnd; k++)
	        A[k] = B[k];
	}
}

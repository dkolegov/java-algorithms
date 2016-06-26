package info.kolegov.sort;

import java.util.Comparator;

import info.kolegov.array.ArrayUtils;

public class SelectionSorter extends Sorter {

	public <T> void sort(Object[] list, Comparator<? super T> c) {
		int i,j;
		int n = list.length;
		/* advance the position through the entire array */
		/*   (could do j < n-1 because single element is also min element) */
		for (j = 0; j < n-1; j++) {
		    /* find the min element in the unsorted list[j .. n-1] */

		    /* assume the min is the first element */
		    int iMin = j;
		    /* test against elements after j to find the smallest */
		    for ( i = j+1; i < n; i++) {
		        /* if this element is less, then it is the new minimum */
		        if (compare(list[i], list[iMin], c) < 0) {
		            /* found new minimum; remember its index */
		            iMin = i;
		        }
		    }

		    if(iMin != j) {
		    	ArrayUtils.swap(list, j, iMin);
		    }
		}
	}
}

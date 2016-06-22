package info.kolegov.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SelectionSorter implements Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		int i,j;
		int n = list.size();
		/* advance the position through the entire array */
		/*   (could do j < n-1 because single element is also min element) */
		for (j = 0; j < n-1; j++) {
		    /* find the min element in the unsorted list[j .. n-1] */

		    /* assume the min is the first element */
		    int iMin = j;
		    /* test against elements after j to find the smallest */
		    for ( i = j+1; i < n; i++) {
		        /* if this element is less, then it is the new minimum */
		        if (list.get(i).compareTo(list.get(iMin)) < 0) {
		            /* found new minimum; remember its index */
		            iMin = i;
		        }
		    }

		    if(iMin != j) {
		        Collections.swap(list, j, iMin);
		    }
		}
	}

	public <T> void sort(List<T> list, Comparator<? super T> c) {
		int i,j;
		int n = list.size();
		/* advance the position through the entire array */
		/*   (could do j < n-1 because single element is also min element) */
		for (j = 0; j < n-1; j++) {
		    /* find the min element in the unsorted list[j .. n-1] */

		    /* assume the min is the first element */
		    int iMin = j;
		    /* test against elements after j to find the smallest */
		    for ( i = j+1; i < n; i++) {
		        /* if this element is less, then it is the new minimum */
		        if (c.compare(list.get(i), list.get(iMin)) < 0) {
		            /* found new minimum; remember its index */
		            iMin = i;
		        }
		    }

		    if(iMin != j) {
		        Collections.swap(list, j, iMin);
		    }
		}
	}

}

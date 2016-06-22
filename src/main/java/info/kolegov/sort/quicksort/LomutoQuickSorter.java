package info.kolegov.sort.quicksort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This scheme is attributed to Nico Lomuto and popularized by Bentley
 * in his book Programming Pearls and Cormen et al. in their book Introduction to Algorithms.
 * @author Dmitry
 *
 */
public class LomutoQuickSorter extends QuickSorter {

	@Override
	protected <T extends Comparable<? super T>> void quickSort(List<T> list, int lo, int hi) {
		if (lo < hi) {
			int p = partition(list, lo, hi);
			// sort sublists without a previous pivot element. 
			quickSort(list, lo, p - 1);
			quickSort(list, p + 1, hi);
		}
	}

	@Override
	protected <T extends Comparable<? super T>> int partition(
			List<T> list, int lo, int hi
	) {
		// choose pivot
		// divide the 'list' by the chosen pivot: if element less then the pivot place before otherwise after the pivot.
		T pivot = list.get(hi);
		int i = lo - 1;
		for (int j = lo; j<hi; j++) {
		    if (list.get(j).compareTo(pivot) <= 0) {
		        i++;
        		Collections.swap(list, i, j);
		    }
		}
        Collections.swap(list, i+1, hi);
		//return pivot location.
		return i + 1;
	}

	@Override
	protected <T> void quickSort(List<T> list, int lo, int hi, Comparator<? super T> c) {
		if (lo < hi) {
			int p = partition(list, lo, hi, c);
			quickSort(list, lo, p - 1, c);
			quickSort(list, p + 1, hi, c);
		}
	}

	@Override
	protected <T> int partition(List<T> list, int lo, int hi, Comparator<? super T> c) {
		// choose pivot
		T pivot = list.get(hi);
		int i = hi-1;
		int j = lo;
		while (j<=i) {
			if (c.compare(list.get(j), pivot) >= 0) {
				Collections.swap(list, i, j);
				i--;
			} else {
				j++;
			}
		}
		i++;
		Collections.swap(list, i, hi);
		return i;
	}
}

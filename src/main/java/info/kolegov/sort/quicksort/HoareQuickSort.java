package info.kolegov.sort.quicksort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The original partition scheme described by C.A.R. Hoare uses two indices that start at the ends of the array being partitioned,
 * then move toward each other, until they detect an inversion: a pair of elements, one greater than the pivot, one smaller,
 * that are in the wrong order relative to each other.
 * @author Dmitry
 *
 */
public class HoareQuickSort extends QuickSort {

	@Override
	protected <T extends Comparable<? super T>> void quickSort(List<T> list, int lo, int hi) {
		if (lo < hi) {
			int p = partition(list, lo, hi);
			// sort sublists without a previous pivot element. 
			quickSort(list, lo, p);
			quickSort(list, p + 1, hi);
		}
	}

	@Override
	protected <T extends Comparable<? super T>> int partition(List<T> list, int lo, int hi) {
		T pivot  = list.get(lo);
		int i = lo - 1;
		int j = hi + 1;
		do {
			do {
				i++;
			} while (list.get(i).compareTo(pivot) < 0);
			do {
				j--;
			} while (list.get(j).compareTo(pivot) > 0);
			if (i >= j) {
				return j;
			}
			Collections.swap(list, i, j);
		} while (true);
	}

	@Override
	protected <T> void quickSort(List<T> list, int lo, int hi, Comparator<? super T> c) {
		if (lo < hi) {
			int p = partition(list, lo, hi, c);
			quickSort(list, lo, p, c);
			quickSort(list, p + 1, hi, c);
		}
	}

	@Override
	protected <T> int partition(List<T> list, int lo, int hi, Comparator<? super T> c) {
		T pivot  = list.get(lo);
		int i = lo - 1;
		int j = hi + 1;
		do {
			do {
				i++;
			} while (c.compare(list.get(i), pivot) < 0);
			do {
				j--;
			} while (c.compare(list.get(j), pivot) > 0);
			if (i >= j) {
				return j;
			}
			Collections.swap(list, i, j);
		} while (true);
	}

}

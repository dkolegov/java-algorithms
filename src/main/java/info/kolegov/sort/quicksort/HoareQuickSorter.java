package info.kolegov.sort.quicksort;

import java.util.Comparator;

import info.kolegov.sort.Sorter;

/**
 * The original partition scheme described by C.A.R. Hoare uses two indices that start at the ends of the array being partitioned,
 * then move toward each other, until they detect an inversion: a pair of elements, one greater than the pivot, one smaller,
 * that are in the wrong order relative to each other.
 * @author Dmitry
 *
 */
public class HoareQuickSorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		quickSort(list, 0, list.length-1, c);
	}

	private <T> void quickSort(Object[] list, int lo, int hi, Comparator<? super T> c) {
		if (lo < hi) {
			int p = partition(list, lo, hi, c);
			quickSort(list, lo, p, c);
			quickSort(list, p + 1, hi, c);
		}
	}

	private <T> int partition(Object[] list, int lo, int hi, Comparator<? super T> c) {
		Object pivot  = list[lo];
		int i = lo - 1;
		int j = hi + 1;
		do {
			do {
				i++;
			} while (compare(list[i], pivot, c) < 0);
			do {
				j--;
			} while (compare(list[j], pivot, c) > 0);
			if (i >= j) {
				return j;
			}
			swap(list, i, j);
		} while (true);
	}


}

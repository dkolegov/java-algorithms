package info.kolegov.sort.quicksort;

import java.util.Comparator;

import info.kolegov.sort.Sorter;

/**
 * This scheme is attributed to Nico Lomuto and popularized by Bentley
 * in his book Programming Pearls and Cormen et al. in their book Introduction to Algorithms.
 * @author Dmitry
 *
 */
public class LomutoQuickSorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		quickSort(list, 0, list.length-1, c);
	}

	private <T> void quickSort(Object[] list, int lo, int hi, Comparator<? super T> c) {
		if (lo < hi) {
			int p = partition(list, lo, hi, c);
			quickSort(list, lo, p - 1, c);
			quickSort(list, p + 1, hi, c);
		}
	}

	private <T> int partition(Object[]  list, int lo, int hi, Comparator<? super T> c) {
		// choose pivot
		Object pivot = list[hi];
		int i = hi-1;
		int j = lo;
		while (j<=i) {
			if (compare(list[j], pivot, c) >= 0) {
				swap(list, i, j);
				i--;
			} else {
				j++;
			}
		}
		i++;
		swap(list, i, hi);
		return i;
	}
}

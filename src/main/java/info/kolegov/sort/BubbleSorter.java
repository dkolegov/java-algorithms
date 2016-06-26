package info.kolegov.sort;

import java.util.Comparator;

import info.kolegov.array.ArrayUtils;

/**
 * Optimized bubble sort
 * @author Dmitry
 *
 */
public class BubbleSorter extends Sorter {

	@Override
	public <T> void sort(Object[] array, Comparator<? super T> c) {
		int n = array.length;
		do {
			int newn = 0;
			for (int i=1; i<n; i++) {
				if (compare(array[i-1], array[i], c) > 0) {
					ArrayUtils.swap(array, i-1, i);
					newn = i;
				}
			}
			n = newn;
	    } while (n != 0);
	}

}

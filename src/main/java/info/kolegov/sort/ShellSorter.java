package info.kolegov.sort;

import java.util.Comparator;

public class ShellSorter extends Sorter {

	@Override
	public <T> void sort(Object[] array, Comparator<? super T> c) {
		int n = array.length;
		Object temp;
		// Marcin Ciura's gap sequence
		int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
		// Start with the largest gap and work down to a gap of 1
		for (int gap : gaps) {
		    // Do a gapped insertion sort for this gap size.
		    // The first gap elements array[0..gap-1] are already in gapped order
		    // keep adding one more element until the entire array is gap sorted
		    for (int i=gap; i<n; i++) {
		        // add array[i] to the elements that have been gap sorted
		        // save array[i] in temp and make a hole at position i
		        temp = array[i];
		        // shift earlier gap-sorted elements up until the correct location for a[i] is found
		        int j;
		        for (j=i; j>=gap && compare(array[j - gap], temp, c) > 0; j -= gap) {
		            array[j] = array[j - gap];
		        }
		        // put temp (the original array[i]) in its correct location
		        array[j] = temp;
		    }
		}
	}

}

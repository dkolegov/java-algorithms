package info.kolegov.sort;

import java.util.Comparator;

import info.kolegov.array.ArrayUtils;

public class OddEvenSorter extends Sorter {

	@Override
	public <T> void sort(Object[] array, Comparator<? super T> c) {
		boolean sorted = false;
		while(!sorted) {
		    sorted = true;
		    for(int i = 1; i < array.length-1; i += 2) {
		    	if(compare(array[i], array[i+1], c)  > 0) {
		    		ArrayUtils.swap(array, i, i+1);
		    		sorted = false;
		    	}
			}
		    for(int i = 0; i < array.length-1; i += 2) {
		    	if(compare(array[i], array[i+1], c)  > 0) {
		    		ArrayUtils.swap(array, i, i+1);
		    		sorted = false;
		    	}
		    }
		}
	}
}

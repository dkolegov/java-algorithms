package info.kolegov.sort.mergesort;

import java.util.Comparator;

import info.kolegov.sort.Sorter;

public class BottomUpMergeSorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		int n = list.length;
	    Object[] temp = new Object[n]; //allocate space just once
	    for (int width = 1; width < n; width = width*2) {
	        for(int i = 0; i < n; i += width*2) {
	            bottomUpMerge(
	            		list,
	            		i,
	            		Math.min(i + width, n),
	            		Math.min(i + 2*width, n),
	            		temp,
	            		c);
	        }
	        copy(list, temp);
	    }
	}

	private <T> void bottomUpMerge(Object[] list, int iLeft, int iRight, int iEnd, Object[] temp,  Comparator<? super T> c) {
	    int i = iLeft, j = iRight;

	    // While there are elements in the left or right runs...
	    for (int k = iLeft; k < iEnd; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i < iRight && (j >= iEnd || compare(list[i], list[j], c)  <= 0)) {
	        	temp[k] = list[i];
	            i = i + 1;
	        } else {
	        	temp[k] = list[j];
	            j = j + 1;    
	        }
	    } 
	}
}

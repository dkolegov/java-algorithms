package info.kolegov.sort.mergesort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import info.kolegov.sort.Sorter;

public class BottomUpMergeSort implements Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		mergeSort(list);

	}

	private <T extends Comparable<? super T>> void mergeSort(List<T> list) {
	    int n = list.size();
	    List<T> temp = initList(n); //allocate space just once
	    for (int width = 1; width < n; width = width*2) {
	        for(int i = 0; i < n; i += width*2) {
	            bottomUpMerge(
            		list,
            		i,
            		Math.min(i + width, n),
            		Math.min(i + 2*width, n),
            		temp
            	);
	        }
	        copy(list, temp);
	    }
	}

	/**
	 * Init list to be able add elements in diff. positions(see method bottomUpMerge).
	 * @param size
	 * @return
	 */
	private <T> List<T> initList(int size) {
		List<T> result = new ArrayList<T>();
		for (int i=0; i<size; i++) {
			result.add(null);
		}
		return result;
	}

	private <T> void copy(List<T> dist, List<T> src) {
		for (int i=0; i<dist.size(); i++) {
			if (src.get(i) != null) {
				dist.set(i, src.get(i));
			}
		}
			
	}

	private <T extends Comparable<? super T>> void bottomUpMerge(List<T> list, int iLeft, int iRight, int iEnd, List<T> temp)
	{
	    int i = iLeft, j = iRight;

	    // While there are elements in the left or right runs...
	    for (int k = iLeft; k < iEnd; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i < iRight && (j >= iEnd || list.get(i).compareTo(list.get(j))  <= 0)) {
	        	temp.add(k, list.get(i));
	            i = i + 1;
	        } else {
	        	temp.add(k, list.get(j));
	            j = j + 1;    
	        }
	    } 
	}

	public <T> void sort(List<T> list, Comparator<? super T> c) {
		mergeSort(list, c);
	}

	private <T> void mergeSort(List<T> list, Comparator<? super T> c) {
	    int n = list.size();
	    List<T> temp = initList(n); //allocate space just once
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

	private <T> void bottomUpMerge(List<T> list, int iLeft, int iRight, int iEnd, List<T> temp,  Comparator<? super T> c)
	{
	    int i = iLeft, j = iRight;

	    // While there are elements in the left or right runs...
	    for (int k = iLeft; k < iEnd; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i < iRight && (j >= iEnd || c.compare(list.get(i), list.get(j))  <= 0)) {
	        	temp.add(k, list.get(i));
	            i = i + 1;
	        } else {
	        	temp.add(k, list.get(j));
	            j = j + 1;    
	        }
	    } 
	}
}

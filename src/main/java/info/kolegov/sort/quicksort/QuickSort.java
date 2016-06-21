package info.kolegov.sort.quicksort;

import java.util.Comparator;
import java.util.List;

import info.kolegov.sort.Sorter;

/**
 * 'Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm,
 * serving as a systematic method for placing the elements of an array in order.
 * Developed by Tony Hoare in 1959, with his work published in 1961, it is still a commonly used
 * algorithm for sorting. When implemented well, it can be about two or three times faster
 * than its main competitors, merge sort and heapsort.'
 * 
 * Read more https://en.wikipedia.org/wiki/Quicksort
 * 
 * @author Dmitry
 *
 */
public abstract class QuickSort implements Sorter {

	abstract protected <T extends Comparable<? super T>> void quickSort(List<T> list, int lo, int hi);

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		quickSort(list, 0, list.size()-1);
	}

	abstract protected <T extends Comparable<? super T>> int partition(List<T> list, int lo, int hi);

	abstract protected <T> void quickSort(List<T> list, int lo, int hi, Comparator<? super T> c);

	abstract protected <T> int partition(List<T> list, int lo, int hi, Comparator<? super T> c);
	
	public <T> void sort(List<T> list, Comparator<? super T> c) {
		quickSort(list, 0, list.size()-1, c);
	}
}

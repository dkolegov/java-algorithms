package info.kolegov.sort.mergesort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import info.kolegov.sort.Sorter;

public class TopDownMergeSorter implements Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		List<T> result = mergeSort(list);
		list.clear();
		list.addAll(result);
	}

	private <T extends Comparable<? super T>> List<T> mergeSort(List<T> m) {
	    // Base case. A list of zero or one elements is sorted, by definition.
		if (m.size() <= 1) {
			return m;
		}
	    // Recursive case. First, divide the list into equal-sized sublists
		int middlePoint = m.size()/2;
		List<T> leftList = m.subList(0, middlePoint);
		List<T> rightList = m.subList(middlePoint, m.size());

	    // Recursively sort both sublists.
		leftList = mergeSort(leftList);
		rightList = mergeSort(rightList);
	
	    // Then merge the now-sorted sublists.
	    return merge(leftList, rightList);
	}

	private  <T extends Comparable<? super T>> List<T> merge(List<T> leftList, List<T> rightList) {
		List<T> result = new ArrayList<T>();
		Iterator<T> leftItr = leftList.iterator();
		Iterator<T> rightItr = rightList.iterator();
		T leftElement = null, rightElement = null;
		boolean doMerge = leftItr.hasNext() && rightItr.hasNext();
		if (doMerge) {
			leftElement = leftItr.next();
			rightElement = rightItr.next();
		}
		while (doMerge) {
			if (leftElement.compareTo(rightElement) <= 0) {
				result.add(leftElement);
				if (leftItr.hasNext()) {
					 leftElement = leftItr.next();
				} else {
					doMerge = false;
					result.add(rightElement);
				}
			} else {
				result.add(rightElement);
				if (rightItr.hasNext()) {
					rightElement = rightItr.next();
				} else {
					doMerge = false;
					result.add(leftElement);
				}
			}
		}

		// Either left or right may have elements left; consume them.
	    // (Only one of the following loops will actually be entered.)
		while (leftItr.hasNext()) {
			result.add(leftItr.next());
		}
		while (rightItr.hasNext()) {
			result.add(rightItr.next());
		}
	    return result;
	}

	public <T> void sort(List<T> list, Comparator<? super T> c) {
		List<T> result = mergeSort(list, c);
		list.clear();
		list.addAll(result);
	}

	private <T> List<T> mergeSort(List<T> m, Comparator<? super T> c) {
	    // Base case. A list of zero or one elements is sorted, by definition.
		if (m.size() <= 1) {
			return m;
		}
	    // Recursive case. First, divide the list into equal-sized sublists
		int middlePoint = m.size()/2;
		List<T> leftList = m.subList(0, middlePoint);
		List<T> rightList = m.subList(middlePoint, m.size());

	    // Recursively sort both sublists.
		leftList = mergeSort(leftList, c);
		rightList = mergeSort(rightList, c);
	
	    // Then merge the now-sorted sublists.
	    return merge(leftList, rightList, c);
	}

	private  <T> List<T> merge(List<T> leftList, List<T> rightList, Comparator<? super T> c) {
		List<T> result = new ArrayList<T>();
		Iterator<T> leftItr = leftList.iterator();
		Iterator<T> rightItr = rightList.iterator();
		T leftElement = null, rightElement = null;
		boolean doMerge = leftItr.hasNext() && rightItr.hasNext();
		if (doMerge) {
			leftElement = leftItr.next();
			rightElement = rightItr.next();
		}
		while (doMerge) {
			if (c.compare(leftElement, rightElement) <= 0) {
				result.add(leftElement);
				if (leftItr.hasNext()) {
					 leftElement = leftItr.next();
				} else {
					doMerge = false;
					result.add(rightElement);
				}
			} else {
				result.add(rightElement);
				if (rightItr.hasNext()) {
					rightElement = rightItr.next();
				} else {
					doMerge = false;
					result.add(leftElement);
				}
			}
		}

		// Either left or right may have elements left; consume them.
	    // (Only one of the following loops will actually be entered.)
		while (leftItr.hasNext()) {
			result.add(leftItr.next());
		}
		while (rightItr.hasNext()) {
			result.add(rightItr.next());
		}
	    return result;
	}
}

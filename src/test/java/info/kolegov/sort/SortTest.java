package info.kolegov.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import info.kolegov.sort.mergesort.BottomUpMergeSort;
import info.kolegov.sort.mergesort.TopDownMergeSort;
import info.kolegov.sort.quicksort.HoareQuickSort;
import info.kolegov.sort.quicksort.LomutoQuickSort;

public class SortTest {

	private void testSort(Sorter sorter, int listSize, int stepSize) {
		System.out.println("Test a Comparable Sorter of " + sorter.getClass());
		for (int i=0; i<stepSize; i++) {
			List<Integer> list = createShuffledIntList(listSize);
			System.out.println(" Step " + i);

		    Assert.assertFalse(isSorted(list));
		    System.out.println("	Shuffled: " + list);
		    sorter.sort(list);
		    System.out.println("	Sorted: " + list);
		    Assert.assertTrue(isSorted(list));
		}
		
		System.out.println("Test a Comparator Sorter of " + sorter.getClass());
		Comparator<Integer> c = new Comparator<Integer>() {

			public int compare(Integer arg0, Integer arg1) {
				if (arg0 > arg1) {
					return -1;
				} else if (arg0 < arg1) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		for (int i=0; i<stepSize; i++) {
			List<Integer> list = createShuffledIntList(listSize);
			System.out.println(" Step " + i);
		    Assert.assertFalse(isSorted(list));
		    System.out.println("	Shuffled: " + list);
		    sorter.sort(list, c);
		    System.out.println("	Sorted: " + list);
		    Assert.assertTrue(isSorted(list, c));
		}
	}

	private <T extends Comparable<T>> boolean isSorted(List<T> list) {
		for(int i=0; i<list.size()-1; i++) {
			if (list.get(i).compareTo(list.get(i+1)) > 0) {
				return false;
			}
		}
		return true;
	}

	private <T> boolean isSorted(List<T> list, Comparator<T> c) {
		for(int i=0; i<list.size()-1; i++) {
			if (c.compare(list.get(i), list.get(i+1)) > 0) {
				return false;
			}
		}
		return true;
	}

	private List<Integer> createShuffledIntList(int size) {
		List<Integer> list = new LinkedList<Integer>();
		for (int j=0; j<size; j++) {
			list.add(j);
		}
	    Collections.shuffle(list);
	    return list;
	}

	@Test
	public void testQuickSort() {
		testSort(new HoareQuickSort(), 20, 3);
		testSort(new LomutoQuickSort(), 20, 3);
	}

	@Test
	public void testMergeSort() {
		testSort(new TopDownMergeSort(), 25, 3);
		testSort(new BottomUpMergeSort(), 25, 3);
	}
}

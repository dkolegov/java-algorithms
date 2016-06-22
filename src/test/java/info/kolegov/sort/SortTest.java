package info.kolegov.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import info.kolegov.sort.heapsort.SiftDownHeapsorter;
import info.kolegov.sort.heapsort.SiftUpHeapsorter;
import info.kolegov.sort.mergesort.BottomUpMergeSorter;
import info.kolegov.sort.mergesort.TopDownMergeSorter;
import info.kolegov.sort.quicksort.HoareQuickSorter;
import info.kolegov.sort.quicksort.LomutoQuickSorter;

public class SortTest {

	private Comparator<Integer> c = new Comparator<Integer>() {

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

	private List<Integer> list;

	private void testSort(Sorter sorter, List<Integer> list) {
		System.out.println(sorter.getClass().getSimpleName() + " with 'Comparable'");
		List<Integer> listToSort = new ArrayList<Integer>(list);
	    Assert.assertFalse(isSorted(listToSort));
	    System.out.println("	Shuffled: " + listToSort);
	    sorter.sort(listToSort);
	    System.out.println("	Sorted: " + listToSort);
	    Assert.assertTrue(isSorted(listToSort));
	
	    System.out.println(sorter.getClass().getSimpleName() + " with 'Comparator'");
	    listToSort  = new ArrayList<Integer>(list);
	    Assert.assertFalse(isSorted(listToSort));
	    System.out.println("	Shuffled: " + listToSort);
	    sorter.sort(listToSort, c);
	    System.out.println("	Sorted: " + listToSort);
	    Assert.assertTrue(isSorted(listToSort, c));
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
	public void testQuicksort() {
		list = createShuffledIntList(25);
		testSort(new HoareQuickSorter(), list);
		testSort(new LomutoQuickSorter(), list);
	}

	@Test
	public void testMergesort() {
		list = createShuffledIntList(25);
		testSort(new TopDownMergeSorter(), list);
		testSort(new BottomUpMergeSorter(), list);
	}

	@Test
	public void testHeapsort() {
		list = createShuffledIntList(25);
		testSort(new SiftDownHeapsorter(), list);
		testSort(new SiftUpHeapsorter(), list);
	}

	@Test
	public void testInsertionSort() {
		list = createShuffledIntList(25);
		testSort(new InsertionSorter(), list);
	}

	@Test
	public void testSelectionSort() {
		list = createShuffledIntList(25);
		testSort(new SelectionSorter(), list);
	}
}

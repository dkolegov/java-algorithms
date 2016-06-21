package info.kolegov.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import info.kolegov.sort.quicksort.HoareQuickSort;
import info.kolegov.sort.quicksort.LomutoQuickSort;

public class SortTest {

	private void testSort(Sorter sorter) {
		System.out.println("Test a Comparable Sorter of " + sorter.getClass());
		for (int i=0; i<20; i++) {
			List<Integer> list = new LinkedList<Integer>();
			for (int j=0; j<20; j++) {
				list.add(j);
			}
			System.out.println(" Step " + i);
		    Collections.shuffle(list);
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
		for (int i=0; i<20; i++) {
			List<Integer> list = new LinkedList<Integer>();
			for (int j=0; j<20; j++) {
				list.add(j);
			}
			System.out.println(" Step " + i);
		    Collections.shuffle(list);
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

	@Test
	public void testQuickSort() {
		testSort(new HoareQuickSort());
		testSort(new LomutoQuickSort());
	}
}

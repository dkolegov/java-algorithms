package info.kolegov.sort;

import java.util.Comparator;
import java.util.List;

public class InsertionSorter implements Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list) {
		for (int i=1;i<list.size(); i++) {
		    T x = list.get(i);
    	    int j = i - 1;
    	    while (j >= 0 && list.get(j).compareTo(x) > 0) {
    	    	list.set(j+1, list.get(j));
    	    	j--;
    	    }
    	    list.set(j+1, x);
		}
	}

	public <T> void sort(List<T> list, Comparator<? super T> c) {
		for (int i=1;i<list.size(); i++) {
		    T x = list.get(i);
    	    int j = i - 1;
    	    while (j >= 0 && c.compare(list.get(j), x) > 0) {
    	    	list.set(j+1, list.get(j));
    	    	j--;
    	    }
    	    list.set(j+1, x);
		}
	}

}

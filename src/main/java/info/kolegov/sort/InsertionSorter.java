package info.kolegov.sort;

import java.util.Comparator;

public class InsertionSorter extends Sorter {

	@Override
	public <T> void sort(Object[] list, Comparator<? super T> c) {
		for (int i=1;i<list.length; i++) {
		    Object x = list[i];
    	    int j = i - 1;
    	    while (j >= 0 && compare(list[j], x, c) > 0) {
    	    	list[j+1] = list[j];
    	    	j--;
    	    }
    	    list[j+1] = x;
		}
	}

}

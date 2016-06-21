package info.kolegov.sort;

import java.util.Comparator;
import java.util.List;

public interface Sorter {

	public <T extends Comparable<? super T>> void sort(List<T> list);

	public <T> void sort(List<T> list, Comparator<? super T> c);
}

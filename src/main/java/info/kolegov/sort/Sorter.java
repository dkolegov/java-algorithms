package info.kolegov.sort;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public abstract class Sorter {

	@SuppressWarnings({"unchecked"})
	<T extends Comparable<? super T>> void sort(List<T> list) {
		Object[] a = list.toArray();
        sort(a, null);
        ListIterator<T> i = list.listIterator();
        for (Object e : a) {
            i.next();
            i.set((T) e);
        }
	}

	@SuppressWarnings({"unchecked"})
	public <T> void sort(List<T> list, Comparator<? super T> c) {
		Object[] a = list.toArray();
        sort(a, c);
        ListIterator<T> i = list.listIterator();
        for (Object e : a) {
            i.next();
            i.set((T) e);
        }
	}

	public abstract <T> void sort(Object[] array, Comparator<? super T> c);

	@SuppressWarnings({"fallthrough", "rawtypes", "unchecked"})
	protected <T> int compare(Object a, Object b, Comparator<? super T> c) {
		if (c == null) {
			Comparable el = (Comparable) a;
			return el.compareTo(b);
		} else {
			return c.compare((T) a,(T) b);
		}
	}
}

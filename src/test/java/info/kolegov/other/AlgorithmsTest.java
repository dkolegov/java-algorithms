package info.kolegov.other;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import info.kolegov.datastructure.Interval;

public class AlgorithmsTest {

	@Test
	public void testMergeIntervals() {
		// [1,3],[2,6],[8,10],[15,18]
		List<Interval> intervals = new ArrayList<>();
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(2, 6);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(15, 18);
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		System.out.println(intervals);
		System.out.println(MergeIntervals.merge(intervals));
		
		// [-3, 0][-1, 5][-5, -4][6, 7][1, 5][2, 4]
		intervals.clear();;
		i1 = new Interval(-3, 0);
		i2 = new Interval(-1, 5);
		i3 = new Interval(-5, -4);
		i4 = new Interval(1, 5);
		Interval i5 = new Interval(6, 7);
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		intervals.add(i5);
		System.out.println(intervals);
		System.out.println(MergeIntervals.merge(intervals));
	}
}

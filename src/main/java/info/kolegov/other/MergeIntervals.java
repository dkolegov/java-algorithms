package info.kolegov.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import info.kolegov.datastructure.Interval;

/**
 * Given a collection of intervals, merge all overlapping intervals.

	For example,
	Given [1,3],[2,6],[8,10],[15,18],
	return [1,6],[8,10],[15,18].
 *
 */
public class MergeIntervals {

	/**
	 * Given a collection of intervals, merge all overlapping intervals.
		For example,
		Given [1,3],[2,6],[8,10],[15,18],
		return [1,6],[8,10],[15,18].
	 * @param intervals
	 * @return
	 */
	public static List<Interval> merge(List<Interval> intervals) {
	    List<Interval> result = new ArrayList<>();
	 
	    if(intervals==null||intervals.size()==0)
	        return result;
	 
	    Collections.sort(
	    		intervals,
	    		(i1, i2) -> i1.getStart()!=i2.getStart() ? i1.getStart()-i2.getStart() : i1.getEnd()-i2.getEnd()
		);

	 
	    Interval pre = intervals.get(0);
	    for(Interval curr : intervals){
	        if(curr.getStart()>pre.getEnd()) {
	            result.add(pre);
	            pre = curr;
	        } else {
	            Interval merged = new Interval(pre.getStart(), Math.max(pre.getEnd(), curr.getEnd()));
	            pre = merged;
	        }
	    }
	    result.add(pre);
	 
	    return result;
	}
}

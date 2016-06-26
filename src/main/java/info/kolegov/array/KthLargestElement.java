package info.kolegov.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.

	For example, given [3,2,1,5,6,4] and k = 2, return 5.

	Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 *
 */
public class KthLargestElement {

	public static int minHeapFind(int[] nums, int k) {
	    Queue<Integer> q = new PriorityQueue<>(k);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	    return q.peek();
	}

	public static int simpleFind(int[] nums, int k) {
	    Arrays.sort(nums);
	    return nums[nums.length-k];
	}
}

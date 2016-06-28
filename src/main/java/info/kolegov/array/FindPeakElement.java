package info.kolegov.array;

public class FindPeakElement {

	/**
	 * A peak element is an element that is greater than its neighbors.
	 * Given an input array where num[i] ≠ num[i+1], find a peak element
	 * and return its index. The array may contain multiple peaks,
	 * in that case return the index to any one of the peaks is fine. 
	 * 
	 * You may imagine that num[-1] = num[n] = -∞. For example,
	 * in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
	 * @return
	 */
	public static int findPeak(int[] array) {
		if(array == null || array.length ==0){
			return -1;
		}

		int start = 0, end = array.length, mid = 0;
		
		while(true) {
			mid = Math.floorDiv(start+end, 2);
			if (mid == 0 && array[0] > array[1] ||
				mid == array.length && array[mid-1] < array[mid] ||
				array[mid-1] < array[mid] && array[mid] > array[mid+1])
			{
				return mid;
			} else if (mid != 0 && array[mid-1] > array[mid]) {
				end = mid-1;
			} else if (mid != array.length){
				start = mid+1;
			} else {
				return -1; // array does not contain any peak
			}
		}
	}
}

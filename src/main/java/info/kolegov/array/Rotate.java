package info.kolegov.array;

/**
 * Rotate an array of n elements to the right by k steps.

	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 */
public class Rotate {

	public static void rotateWithCopy(int[] nums, int k) {
	    if(k > nums.length) {
	        k=k%nums.length;
	    }	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++) {
	        result[i] = nums[nums.length-k+i];
	    }
	 
	    int j=0;
	    for(int i=k; i<nums.length; i++) {
	        result[i] = nums[j];
	        j++;
	    }
	 
	    System.arraycopy( result, 0, nums, 0, nums.length );
	}

	/**
	 * This solution is like a bubble sort.
	 * @param arr
	 * @param order
	 */
	public static void rotateBubble(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				ArrayUtils.swap(arr, j, j-1);
			}
		}
	}

	/**
	 * Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:
		1. Divide the array two parts: 1,2,3,4 and 5, 6
		2. Reverse first part: 4,3,2,1,5,6
		3. Reverse second part: 4,3,2,1,6,5
		4. Reverse the whole array: 5,6,1,2,3,4
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void rotateReverse(int[] arr, int order) {	
		if (arr == null || arr.length==0 || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		if(order > arr.length){
			order = order %arr.length;
		}
	 
		//length of first part
		int a = arr.length - order; 
	 
		ArrayUtils.reverse(arr, 0, a-1);
		ArrayUtils.reverse(arr, a, arr.length-1);
		ArrayUtils.reverse(arr, 0, arr.length-1);
	 
	}
}

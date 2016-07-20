package info.kolegov.array;

import java.util.Arrays;

public class MaximumSubarray {
	public static int[] maxSubArray(int[] A) {
		 int newsum=A[0];
		 int max=A[0];
		 int start=0, end=0;
		 for(int i=1; i<A.length; i++){
			  newsum=Math.max(newsum+A[i],A[i]);
			  if (newsum+A[i] < A[i]) {
		  		start = i+1;
			  }
			  if (max > newsum) {
		  		end = i-1;
			  }
			  max= Math.max(max, newsum);
		 }
		 return Arrays.copyOfRange(A, start, end);
	 }
}

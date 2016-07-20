package info.kolegov.array;

import java.util.Arrays;

public class MaximumSubarray {

	/**
	 * Jay Kadane, 1984
	 * @param A
	 * @return
	 */
	public static int[] maxSubArray(int[] A) {
		int ans = A[0],
			ans_l = 0,
			ans_r = 0,
			sum = 0,
			minus_pos = -1;
			for (int r=0; r<A.length; r++) {
				sum += A[r];
				if (sum > ans) {
					ans = sum;
					ans_l = minus_pos + 1;
					ans_r = r;
				}
				if (sum < 0) {
					sum = 0;
					minus_pos = r;
				}
			}
		 return Arrays.copyOfRange(A, ans_l, ans_r+1);
	 }
}

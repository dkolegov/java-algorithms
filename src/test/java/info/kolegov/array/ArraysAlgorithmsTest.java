package info.kolegov.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class ArraysAlgorithmsTest {

	@Test
	public void testKthLagestElement() {
		int[] testArray = new int[]{3, 2, 6, 23, 12, 2, 7, 21, 78};
		Assert.assertEquals(12, KthLargestElement.minHeapFind(testArray, 4));
		Assert.assertEquals(12, KthLargestElement.simpleFind(testArray, 4));
	}

	@Test
	public void testRotate() {
		int[] testArray = new int[]{1,2,3,4,5,6,7};
		Rotate.rotateBubble(testArray, 3); // 1,2,3,4,5,6,7 - > 5,6,7,1,2,3,4
		System.out.println(Arrays.toString(testArray));
		Assert.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, testArray);
		Rotate.rotateReverse(testArray, 3); // 5,6,7,1,2,3,4 - > 2,3,4,5,6,7,1
		System.out.println(Arrays.toString(testArray));
		Assert.assertArrayEquals(new int[]{2,3,4,5,6,7,1}, testArray);
		Rotate.rotateReverse(testArray, 1);
		System.out.println(Arrays.toString(testArray));// 2,3,4,5,6,7,1 -> 1,2,3,4,5,6,7
		Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7}, testArray);
	}

	@Test
	public void testFindPeakElement() {
		int[] testArray = new int[]{1, 2, 3, 1};
		Assert.assertEquals(2, FindPeakElement.findPeak(testArray));
		testArray = new int[]{3, 2, 6, 23, 12, 2, 7, 21, 78};
		Assert.assertEquals(0, FindPeakElement.findPeak(testArray));
		testArray = new int[]{2,3,4,5,6,7,1};
		Assert.assertEquals(5, FindPeakElement.findPeak(testArray));
	}

	@Test
	public void testMaximumSubarray() {
		int[] in = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int[] expected = new int[]{4, -1, 2, 1};
		Assert.assertArrayEquals(expected, MaximumSubarray.maxSubArray(in));
	}
}

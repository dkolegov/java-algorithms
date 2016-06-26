package info.kolegov.array;

import org.junit.Test;

import info.kolegov.string.WordLadder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;


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
}

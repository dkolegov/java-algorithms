package info.kolegov.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class StringAlgorithmsTest {

	@Test
	public void testIsomorphicString() {
		Assert.assertTrue(IsomorphicString.isIsomorphic("egg", "add"));
		Assert.assertFalse(IsomorphicString.isIsomorphic("foo", "bar"));
		Assert.assertTrue(IsomorphicString.isIsomorphic("dima", "vica"));
	}

	@Test
	public void testReverseWordsInString() {
		String test = "how much wood whould a woodchuck chuck if a woodchuck could chuck wood";
		String reversedTest = "wood chuck could woodchuck a if chuck woodchuck a whould wood much how";
		Assert.assertTrue(ReverseWordsInString.reverseWords(test).equals(reversedTest));
	}

	@Test
	public void testWordNode() {
		String start = "hit",
				end = "cog";
		Set<String> dict = new HashSet<>(Arrays.asList("mit", "hot","dot","dog","lot","log"));
		Assert.assertEquals(WordLadder.ladderLength(start, end, dict), 5); // hit -> hot -> dot -> lot -> log -> cog
	}
}

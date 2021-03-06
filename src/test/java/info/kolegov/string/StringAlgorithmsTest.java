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
		Assert.assertEquals(5, WordLadder.ladderLength(start, end, dict)); // hit -> hot -> dot -> lot -> log -> cog
	}

	@Test
	public void testValidPalindrome() {
		String str = "Was it a car or a cat I saw?";
		Assert.assertTrue(ValidPalindrome.isValidPalindrome(str));
		str = "Was it a car or a dog I saw?";
		Assert.assertFalse(ValidPalindrome.isValidPalindrome(str));
	}

	@Test
	public void testLengthOfLastWord() {
		String str = "Was it a car or a cat I saw?";
		Assert.assertEquals(3, LengthofLastWord.lengthOfLastWord(str));
		str = "how much wood whould a woodchuck chuck if a woodchuck could chuck wood";
		Assert.assertEquals(4, LengthofLastWord.lengthOfLastWord(str));
	}
}

package info.kolegov.string;

import info.kolegov.array.ArrayUtils;

public class ReverseWordsInString {

	/**
	 * Given an input string, reverse the string word by word. 
	 * A word is defined as a sequence of non-space characters.
	 * The input string does not contain leading or trailing spaces
	 * and the words are always separated by a single space.
		
		For example,
		Given s = "the sky is blue",
		return "blue is sky the".
		
	 * Could you do it in-place without allocating extra space?
	 * @param s
	 */
	public static String reverseWords(String text) {
		char[] chars = text.toCharArray();
		reverseWords(chars);
		return new String(chars);
	}
	
	private static void reverseWords(char[] s) {
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	        	ArrayUtils.reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	    ArrayUtils.reverse(s, i, s.length-1);
	 
	    ArrayUtils.reverse(s, 0, s.length-1);
	}
}

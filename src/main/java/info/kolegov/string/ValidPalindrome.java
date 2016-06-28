package info.kolegov.string;

public class ValidPalindrome {

	/**
	 * Given a string, determine if it is a palindrome,
	 * considering only alphanumeric characters and ignoring cases.

		For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
	 * @param s
	 * @return
	 */
	public static boolean isValidPalindrome(String s){
		
		if (s==null || s.length()==0) {
			return false;
		}
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int length = s.length();
		for(int i=0; i<length; i++) {
			if(s.charAt(i) != s.charAt(length - 1 - i)) {
				return false;
			}
		}
 
		return true;
	}
}

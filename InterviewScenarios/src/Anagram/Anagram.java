package Anagram;

import java.util.Arrays;

public class Anagram {

	public static void main (String[] args)
	{
		String str1="raja";
		String str2="ajar";
		System.out.println("Both Strings are Anagrams "+ anagramcheck(str1, str2));
	}

	private static boolean anagramcheck(String str1, String str2) {
		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}
}

/*@Purpose : One string is an anagram of another if the second is simply a
 * rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 * @File : Check For Anagram
 * @Author : Akshay Kumar 
 */
package com.blz.datastructure;

import java.util.Arrays;

public class Anagram {
	/*
	 * @Purpose: Getting Of Elements Of Two Strings
	 * 
	 * @Param: Elements Of Char Array str1 And str2
	 * 
	 * @Return: True Or False
	 */
	static boolean areAnagram(char[] str1, char[] str2) {
		// Get length of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	/*
	 * @Purpose: Sorting Of Elements Using Bubble Sort
	 * 
	 * @Param: Elements Of String Array
	 */
	public static void main(String args[]) {
		char str1[] = { 'A', 'K', 'S', 'H', 'A', 'Y' };
		char str2[] = { 'A', 'K', 'S', 'H', 'A', 'Y' };

		// Function Call
		if (areAnagram(str1, str2))
			System.out.println("The Two Strings Are" + " Anagram Of Each Other");
		else
			System.out.println("The Two Strings Are Not" + " Anagram Of Each Other");
	}
}

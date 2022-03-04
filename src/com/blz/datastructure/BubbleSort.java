/*@Purpose:Read in a list of words from File. Then prompt the user to enter a word to
 * search the list. The program reports if the search word is found in the list.
 * @File: Bubble Sort the Elements from Word List
 * @Author: Akshay Kumar
 */
package com.blz.datastructure;

public class BubbleSort {

	public static String[] sort(String array[], int length) {
		String temp = " ";
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String[] elements = { "one", "two", "three", "four", "five", "six", "seven", "eight" };
		String sortedArray[] = sort(elements, elements.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}

package com.blz.datastructure;

import java.util.Arrays;

public class BinarySearchWord {

	public static void main(String[] args) {
		String[] arrayElements = { "Akshay", "Karthik", "Rushi", "Shubham", "Suraj", "Susobhan" };
		Arrays.sort(arrayElements);
		System.out.println(Arrays.toString(arrayElements));
		String search = "Suraj";
		int result = binarySearch(arrayElements, search);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	static int binarySearch(String[] arrayElements, String search) {
		int left = 0, right = arrayElements.length - 1;
		while (left <= right) {
			int m = left + (right - left) / 2;
			int result = search.compareTo(arrayElements[m]);
			if (result == 0)
				return m;
			if (result > 0)
				left = m + 1;
			else
				right = m - 1;
		}

		return -1;
	}
}

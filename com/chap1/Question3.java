package com.chap1;

// Question: Given two strings, write a method to decide if one is a permutation of the other.

public class Question3 {
	
	// Solution #1: Sort the strings
	public String sortString(String str) {
		//
		char[] charArray = str.toCharArray();
		java.util.Arrays.sort(charArray);
		return new String(charArray);
	}
	public boolean checkPermutation1(String str1, String str2) {
		//
		if(str1.length() != str2.length()) {
			return false;
		}
		//
		String sortedStr1 = sortString(str1);
		String sortedStr2 = sortString(str2);
		//
		return sortedStr1.equals(sortedStr2);
	}
	
	// Solution #2: Store character counts of each string separately and compare
	public boolean checkPermutation2(String str1, String str2) {
		//
		if(str1.length() != str2.length()) {
			return false;
		}
		// Assuming its ASCII strings
		int[] char_set1 = new int[256];;
		//
		for(int i = 0; i < str1.length(); i++) {
			int value = str1.charAt(i);
			char_set1[value]++;
		}
		//
		for(int j = 0; j < str2.length(); j++) {
			int value = str2.charAt(j);
			// check already built array for str1 if these values are stored
			if(--char_set1[value] < 0) {
				return false;
			}
		}
		//
		return true;
	}

	public static void main(String[] args) {
		// Get object
		Question3 q3Obj = new Question3();
		// Test
		System.out.println(q3Obj.checkPermutation1("was it a car or a cat i saw", "was i cat a or car a it was"));
		System.out.println(q3Obj.checkPermutation2("was it a car or a cat i saw", "was i cat a or car a it was"));
		
		
	}

}

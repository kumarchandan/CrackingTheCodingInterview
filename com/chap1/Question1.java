package com.chap1;

//Question: Implement an algorithm to determine if a string has all unique characters.
//What if you cannot use additional data structures?


public class Question1 {
	
	// Assume String input is ASCII
	public boolean hasUniqueElements(String str) {
		//
		if(str.length() > 256) {
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		
		for(int i = 0; i < str.length(); i++) {
			//
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	// The time complexity for this code is O(n)

	public static void main(String[] args) {
		//
		Question1 arrayq1Obj = new Question1();
		String text = "lorem_ip";
		System.out.println(arrayq1Obj.hasUniqueElements(text));
		
	}

}


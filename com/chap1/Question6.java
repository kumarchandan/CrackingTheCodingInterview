package com.chap1;

// 6. Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
//     to rotate the image by 90 degrees. Can you do this in place?
// Ans: If we rotate the array by 90 degrees. All columns becomes Rows and All Rows becomes Columns.

public class Question6 {
	
	// Solution #1: Use an array
	/**
	 * @param arr
	 * @return
	 */
	public int[][] rotate90(int[][] arr) {
		// 
		int colLen = arr.length - 1;
		int rowLen = arr[0].length - 1 | 0;
		
		// If not NxN matrix return null
		if(colLen != rowLen) {
			return null;
		}
		//
		int[][] newArr = new int[rowLen + 1][colLen + 1];
		
		//
		for(int i = 0; i <= rowLen; i++) {
			int count = 0;
			for(int j = colLen; j >= 0; j--) {
				newArr[i][count++] = arr[j][i];
			}
		}
		//
		return newArr;
	}
	
	public static void main(String[] args) {
		//
		Question6 q6Obj = new Question6();
		//
		int[][] testArr = new int[4][4];
		int count = 1;
		for(int i = 0; i < testArr.length; i++) {
			for(int j = 0; j < testArr.length; j++) {
				testArr[i][j] = count++;
			}
		}
		//
	    q6Obj.rotate90(testArr);
	}
}

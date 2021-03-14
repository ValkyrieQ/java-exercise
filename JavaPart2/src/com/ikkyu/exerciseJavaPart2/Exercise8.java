package com.ikkyu.exerciseJavaPart2;

public class Exercise8 {

	public static void main(String[] args) {
		// 8.1
		int[][] twoD_arr = {{1,2}, {3,4,5}, {6}, {7,8,9,10}};
		for (int[] row: twoD_arr)
			for (int element: row)
			System.out.println(element);
		
		// 8.2
		int total = 0;
		for (int[] row: twoD_arr)
			for (int i=0; i<row.length; i++) {
				if (i == row.length-1)
					total += row[i];
			}
		
		System.out.println("Sum last element of each row (2+5+6+10): " + total);
	}

}

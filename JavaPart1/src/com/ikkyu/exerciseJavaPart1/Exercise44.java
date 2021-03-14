package com.ikkyu.exerciseJavaPart1;

public class Exercise44 {
	public static void main(String[] args) {
		// lab6part1();
		// lab6part2();
		// lab6part3();
		lab6part4();
	}
	
	public static void lab6part1() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
	}
	
	public static void lab6part2() {
		int i = 1;
		int total = 0;
		while (i <= 10) {
			total += i;
			i++;
		}
		
		System.out.println("Sum 1 to 10 = " + total);
	}
	
	public static void lab6part3() {
		int i = 1;
		while (i <= 100) {
			if ((i % 12) == 0) {
				System.out.println("The number is " + i);
			}
			i++;
		}
	}
	
	public static void lab6part4() {
		int arr[] = {1,2,3,4,5};
		for (int num: arr) {
			System.out.println(num);
		}
	}
}

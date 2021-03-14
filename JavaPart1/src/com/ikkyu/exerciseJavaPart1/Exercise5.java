package com.ikkyu.exerciseJavaPart1;

public class Exercise5 {
	public static void main(String[] args) {
		printSum(1,2);
		System.out.println("(Return method) 10+20 = " + sum(10, 20));
	}
	
	public static void printSum(int a, int b) {
		System.out.println("(Void method) Sum is " + (a+b));
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
}

package com.ikkyu.exerciseJavaPart2;

public class Exercise7 {

	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";
		
		// 7.1
		System.out.println("String1 equal String2? : " + (String1.equals(String2)));
		
		// 7.2
		System.out.println("Substring of String1: " + String1.substring(0, 3));
		
		// 7.3
		System.out.println("Length of String1: " + String1.length());
		
		// 7.4 string1 index 1-4 is "ou a"
		System.out.println("Cut string index 1-4 of String1: " + String1.substring(0, 1) + String1.substring(5));
		
		// 7.5
		System.out.println("Trim space first and last of String2: " + String2.trim());
		
		// 7.6 Convert String1 to uppercase
		System.out.println("Convert String1 to uppercase: " + String1.toUpperCase());
		
		// 7.7 convert string2 to uppercase and trim
		System.out.println("Convert String2 and Trim: " + String2.toUpperCase().trim());
		
		
	}

}

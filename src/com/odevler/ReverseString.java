package com.odevler;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String word = sc.nextLine();
		sc.close();
		System.out.println("Reversed String: " + getReverse(word));
		
	}
	
	public static String getReverse(String word) {
		
		StringBuilder builder = new StringBuilder();
		String reverse = builder.append(word).reverse().toString();
		return reverse;
	}
	
	

}

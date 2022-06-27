package com.odevler;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input password");
		String input=scan.nextLine();
		scan.close();
		System.out.println(passwordMask(input));

	}
public static String passwordMask(String str) {
		
		String firstLetter=str.substring(0,1);
		String lastLetter=str.substring(str.length()-1);
		String temp="";
		String star="*";
		for(int i=1;i<str.length()-1;i++) {
			temp+=star;
		}
		
		return firstLetter+temp+lastLetter; 
	}

}

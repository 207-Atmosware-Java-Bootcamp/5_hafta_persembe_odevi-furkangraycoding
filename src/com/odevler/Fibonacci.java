package com.odevler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number for fibonnaci : ");
		Integer input =scan.nextInt();
		scan.close();
		fibonacci(input);

	}
	public static void fibonacci(int number) {
		int [] arr= new int[number];
		int fib=0;
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
				for(int i=2;i<number-2;i++) {
					
					arr[i+2]=arr[i+1]+arr[i];
					
					fib=arr[i+1];
					
					System.out.print(fib+" " );
					
				
			}
		  	
	}
	
	}

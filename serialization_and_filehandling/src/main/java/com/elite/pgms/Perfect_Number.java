package com.elite.pgms;

import java.util.Scanner;

public class Perfect_Number {
	
	public static void main(String[] args) {
		int i = 1, count = 0 ;
		
		Scanner scn = new Scanner(System.in);		
		System.out.println(" Enter any number to check it is perfect number or not: ");
		int num = scn.nextInt();

		
		while(i < num) {
			if(num % i == 0)  {
				count = count + i;
			}
			i++;
		}
		if (count == num) {
			System.out.println( num +" is perfect number");
		}
		else {
			System.out.println( num +" is not a perfect number");
		}
	}
}

package com.elite.pgms;

public class Replace0with2 {
	
		static int Replace0with2(int num) 
		{ 
			if (num == 0) 
				return 0; 
			
			int digit = num % 10; 
			if (digit == 0) 
				digit = 2; 

			return Replace0with2(num / 10) * 10 + digit; 
		} 

		static int Replace0with2_rev(int num) 
		{ 
			if (num == 0) 
				return 2; 
			else
				return Replace0with2(num); 
		} 

		public static void main(String[] args) 
		{ 
			System.out.println(Replace0with2_rev(10120)); 
		} 
	} 


	


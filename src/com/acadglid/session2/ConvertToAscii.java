package com.acadglid.session2;

import java.util.Scanner;

public class ConvertToAscii {

	
	
	public static void main (String [] arg) {
	
		//1. Enter the number from the user and store in variable.
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  
		char asciivalue = (char) num;
		//2. Compare the number with 0
		
		if(num==0) {
			
			System.out.println("You Have Entered Zero");
			System.out.println("The ascii value for the " +num+ " is :"+asciivalue);
			
		}
		
		if(num>0) {
			
			System.out.println("You Have Entered Positive Value");
			System.out.println("The ascii value for the " +num+ " is :"+asciivalue);
		}
		
		if(num<0) {
			
			System.out.println("You Have Entered Negative Value");
			System.out.println("The ascii value for the " +num+ " is :"+asciivalue);
		}
			
			
	}
	

}

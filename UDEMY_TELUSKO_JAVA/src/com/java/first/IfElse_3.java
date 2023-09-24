package com.java.first;
/**
 * If-else is a conditional statement used in java to execute block of code based on the 
 * certain conditions
 */
public class IfElse_3 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		if(a>b)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");
		
	// nested if conditions
		if(a>b)
			System.out.println("a is greater than b");
		else if(b>c)
			System.out.println("b is greater than c");
		else if(a>c)
			System.out.println("a is greater than c");
		else if(c>b)
			System.out.println("c is greater than b");
	
	// using logical and relational operators	
		if(a>b && a>c)
			System.out.println(" a is the greatest");
		else if(b>c)
			System.out.println("b is the greatest");
		else 
			System.out.println("c is the greatest");
		
	}
}

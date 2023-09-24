package com.java.second;

import java.io.IOException;

/**
 * To create custom Exception create exceptionClass and extends the Exception class 
 *
 */
class SpecialException extends Exception{

	private int i =8;
	private int j=0;
	private static final long serialVersionUID = 1L;
	
	public SpecialException(){
		
	}
	
	public SpecialException(String message) {
		super(message);
	}

	public void show() throws IOException 
	{
		System.out.println("divison result = " + i%j);
	}

	public void divide(int i, int j) {
		System.out.println("Divison result of user passed value is " + i%j);
	}
}

public class CustomExceptions_13 {

	public static void main(String[] args) {

		SpecialException custom = new SpecialException("not found");
		try {
			custom.show();
			int i = 2;
			int j = 0;
			if(j==0)
				throw new SpecialException("Not divisible by zero");
			else
				custom.divide(i, j);
		} catch (IOException | SpecialException | ArithmeticException e) {
			System.out.println("exception occured  =" + e.getMessage());
		}
	}
}

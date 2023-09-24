package com.java.second;

/**
 * Exceptions are basically run time errors that are occurred when execution of application 
 * starts.  
 *		There are two type of exceptions
 *	=>	checked exception(compile time exceptions) : exceptions that have the possibility to be	
 *		occurred when execution starts, so compiler throws error. like I/o exception, sql exception, 
 *		classnotfound exception
 *	=>	unchecked exception: exceptions that occur at run time, like arithmetic exception, indexout of bound
 *		exception.	
 *
 *	** If exception occurs in try block, no further statements present in try block will be
 *		executed and exception is catched  by catch block. So statements that are outside try block
 *		will be executed 
 * To handle exception we use try-catch block
 */

public class Exceptions_12 {

	public static void main(String[] args) {
		int i = 8;
		int j = 0;
		try {
			int k = i % j;
			System.out.println(k);
		} catch (Exception e) {
			e.printStackTrace();
		} /*  catch (ArithmeticException e) {
			 this catch gives error because exception is the super class and it has already catched
			 the exception , so if you know the exception type use it.
		}*/
	}
	
}

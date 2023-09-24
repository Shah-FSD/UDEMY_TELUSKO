package com.java.first;

/**
 * final is a keyword used in java with variables, class ,methods
 * 	1. with variable we cannot assign same variable.
 *  2. with class it means that class cannot be extend or any subclass is not possible.
 *  3. with method it means that this method cannot be overridden by subclass.
 *
 */
class Parent {

	public final void show() {
		System.out.println("method developed by Parent.");
	}
	
	public void display() {
		System.out.println("method accessible to all.");
	}
}
class Child extends Parent{
	
	@Override
	public void display() {
		System.out.println("method it accessible to all");
	}
	
}

public class Final_10 {

	final int a = 10;
}

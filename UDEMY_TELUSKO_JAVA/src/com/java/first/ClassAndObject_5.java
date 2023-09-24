package com.java.first;

/**
 * A class is a blueprint or a template for creating objects. 
 * It defines the properties (attributes) and behaviors (methods) that objects of that class will have.
 * A class serves as a blueprint for creating multiple instances of objects with similar characteristics.
 * 
 * Class used to add two numbers
 *
 */
class Calculator {
	
	public int sum(int num1,int num2) {
		return num1+num2;
	}
}

public class ClassAndObject_5 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 6;
		Calculator calci = new Calculator();
		System.out.println("summation of two numbers = " + calci.sum(num1, num2));	
	}

}

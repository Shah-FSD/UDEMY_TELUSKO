package com.java.first;

/**
 * super() is a special keyword that is used to invoke the constructor of the superclass.
 * By default every class constructor has super() method means every class extends the object 
 * class. Every class in java extends the object class.
 *  
 */
class A {

	public A() {
		super();
		System.out.println("constructor of A class");
	}
	
}

class B extends A{

	public B() {
		System.out.println("constructor of B class");
	}
	
}

public class Super_11 {
	
	public static void main(String[] args) {
		B objB = new B();
		
	}

}

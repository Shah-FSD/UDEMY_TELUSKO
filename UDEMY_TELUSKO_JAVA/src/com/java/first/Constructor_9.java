package com.java.first;

/**
 * constructor is a special method used to initialize objects of class. Basically, it protects data
 * means property,variables to be directly accessed by the user.
 *
 * if we create a private constructor, it does not allow instantiation of that class, it is used in 
 * singleton design pattern or when we create some utility class to hold constant values
 */
class Constructor {

	private int number;
	private String type;
	
	public Constructor(){
	// this type of constructor is default constructor, it can be automatically created by compiler
		System.out.println("Default constructor");
	}

	public Constructor(int number, String type) {
	// this type of constructor is called parameterized constructor 
		System.out.println("parameterized constructor");
		this.number = number;
		this.type = type;
	}
	
	public  void show() {
		System.out.println("number = " + number);
		System.out.println("type = " + type);
	}
	
}

public class Constructor_9 {
	
	public static void main(String[] args) {	
		Constructor default_constructor = new Constructor();
		default_constructor.show();
		Constructor parameterized_construntor = new Constructor(5,"Integer");
		parameterized_construntor.show();
	}
	
}

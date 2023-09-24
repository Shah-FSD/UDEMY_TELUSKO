package com.java.first;

/**
 * static is a keyword used to make variables and methods class level members.
 * 
 *
 */
class Test{
	
	int num;
	String name;
	static String fix;
	
	public void show() {
		System.out.println(num+name+fix);
	}
	
	// static block are used to initialize static variables and some extra statements that 
	static {
		fix="fixed";
		System.out.println(fix);
	}
	
}

public class Static_7 {
		
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Test");
	}
	
}

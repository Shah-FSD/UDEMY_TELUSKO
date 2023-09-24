package com.java.first;

/**
 * "this" is a keyword which refers to the current object, uses:
 * 1. refer to instance variables:
 * 2. invoke constructors
 * 3. pass current object as argument
 */
class Person{
	
	private int age;
	private String name;
	
	public Person(String name) {
		this(name,0);
	}
	
	private Person(String name, int age) {
		System.out.println("name: = " + name +"\n"+ " age: = " + age);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age; // here this will not make confusion which age is referring local or instance variable
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}

public class This_8 {

	public static void main(String[] args) {
		Person person = new Person("Gaurav");
		
	}
}

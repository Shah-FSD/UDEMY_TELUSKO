package com.java.oops;

/**
 * polymorphism is one of the important of Object Oriented Programming(oops). It is divided in two parts
 * poly means many and morphism means behavior.
 * In terms of java, we can it as methods with same name but with different behavior. 
 * 
 *  It consists of two parts: 
 *  =>compile time polymorphism also called method overloading in which methods with same name but
 *    with different arguments or has extra parameters, **note: return type is not considered in method
 *    overloading. It also called as early binding. 
 *  => run time polymorphism also called method overriding in which we overrides the parent class method
 *    it occurs in inheritance. It is called late binding and this is actually the main point of polymorphism.
 *       
 */
class MethodOverloading{
	
	public void add(int a, int b) {
		System.out.println("here we add two variables that are of int type and the result is = "+(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("here we add three variable that are of int type and the result is = "+(a+b+c));
	}
}

//method overriding
class Parent {
	
	public void show() {
		System.out.println("showing method of Parent class");
	}
}
class Child extends Parent {
	
	
	@Override
	public void show() {
		System.out.println("showing method of Child Class");
	}

	public void display() {
		System.out.println("extra feature of child class");
	}
}

public class PolyMorphismClass {

	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		{
		// method overloading	
	    obj1.add(1, 2);  
		obj1.add(1,2,3);
	    }
		{
		//method overriding
			Parent obj2 = new Child();
			obj2.show();
		/* obj2.display(); it is not possible
		 * In Java, when you declare a reference variable of a parent class type and 
		 * use it to refer to an object of a child class type 
		 * (as in your example: Parent obj = new Child();), you can only access the methods and members 
		 * that are declared or inherited from the parent class.
		 * This is known as "reference type determines access."
		 * or also called dynamic dispatch method.
		 * 
		 */
		}
		
	}
}


package com.java.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * *The set interface is present in java.util package and extends the Collection interface. 
 *It is an unordered collection of objects in which duplicate values cannot be stored. 
 *It is an interface that implements the mathematical set. 
 *This interface contains the methods inherited from the Collection interface
 *and adds a feature that restricts the insertion of the duplicate elements. 
 *  
 *  A few important features of HashSet are: 
	=> Implements Set Interface.
	=> The underlying data structure for HashSet is Hashtable.
	=> As it implements the Set Interface, duplicate values are not allowed.
	=> Objects that you insert in HashSet are not guaranteed to be inserted in the same order.
	   Objects are inserted based on their hash code.
	=> NULL elements are allowed in HashSet.
	=> HashSet also implements Serializable and Cloneable interfaces.
	
  
 */
public class HashSetClass {
	
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		
		values.add(5);
		values.add(6);
		values.add(5); // here no compilation error occurs because this method is boolean, it shows false for elements that are already inserted.
		
		System.out.println(values);
	}
}

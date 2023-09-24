package com.java.first;

import java.util.Arrays;
import java.util.List;

/**
 * An array is a linear data structure to store elements of same data type in contiguous memory
 * allocation. 
 * we can create an array of anything like primitive data type, objects etc.
 * 
 * arrays are present in heap memory.
 */
public class Array_6 {

	public static void main(String[] args) {
		
		// int[] nums = new int[5]; nums[0] = 4; etc 
		
		int[] nums = {1,2,5,6,7}; // declaring and defining at one step
	
		// accessing all the elements using enhanced for loop		
		for(int num : nums) {
			System.out.println(num);
		}
		
		List<Integer> mutableList = Arrays.asList(1, 2, 3);
        mutableList.set(0, 4); // OK
      //  mutableList.add(5);    // UnsupportedOperationException

        // List.of
        List<Integer> immutableList = List.of(1, 2, 3);
      //  immutableList.set(0, 4); // UnsupportedOperationException
      //  immutableList.add(5); 
		
	}
}

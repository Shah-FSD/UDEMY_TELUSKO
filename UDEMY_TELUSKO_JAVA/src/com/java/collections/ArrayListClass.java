package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

/**
 *An `ArrayList` in Java is a dynamic array-based data structure 
 *that implements the `List` interface from the Java Collections Framework. 
 *It is similar to a regular array but provides dynamic resizing, which means it can grow or shrink as needed.

Here are some key points about `ArrayList`:

1. **Dynamic Sizing:** Unlike traditional arrays, an `ArrayList` can change its size dynamically. 
                       It automatically resizes itself when elements are added or removed.

2. **Ordered:** `ArrayList` maintains the order of elements, so you can access elements by their index.

3. **Duplicates:** `ArrayList` allows duplicate elements. You can store the same element multiple times.

4. **Random Access:** You can access elements in an `ArrayList` in constant time (O(1)) by using their index.

5. **Iterating:** You can iterate through the elements using enhanced `for` loops or iterators.

Now, let's discuss the time complexity for common operations in an `ArrayList`:

- **Insertion (Add an element at the end):** Amortized O(1)
  - Adding an element to the end of an `ArrayList` is typically fast because it involves 
    appending to the end of the underlying array. Occasionally, when the array needs to resize, it takes longer, but this happens infrequently.

- **Insertion (Add an element at a specified index):** O(n)
  - Inserting an element at a specific index requires shifting all the elements after that index,
    which takes linear time.

- **Deletion (Remove an element at the end):** O(1)
  - Removing the last element is a constant-time operation because it doesn't require shifting elements.

- **Deletion (Remove an element at a specified index):** O(n)
  - Removing an element at a specific index requires shifting all the elements after that index, which takes linear time.

- **Access (Get or Set an element by index):** O(1)
  - Accessing elements by their index is a constant-time operation because it directly calculates 
    the memory location of the element.

- **Search (Find an element by value):** O(n)
  - Searching for an element in an `ArrayList` requires iterating through the elements until 
    the element is found, which takes linear time in the worst case.

In summary, `ArrayList` is a versatile data structure that is suitable for situations where you need to
maintain an ordered collection of elements with the ability to add or remove elements efficiently at the end.
It provides constant-time access to elements by index, but inserting or removing elements at arbitrary positions 
can be relatively slow because of the need to shift elements. 

 */
public class ArrayListClass {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("hello");
		arrayList.add("hi");
		
		System.out.println(arrayList);
	// System.out.println(arrayList.get(5)); index out of bound exception
		
		List<Integer> integerList = Arrays.asList(1,2,3); // fixed size but mutable
		
		
		List<Integer> listInteger = List.of(4,5,6);  // fixed size and immutable
		
	}
}

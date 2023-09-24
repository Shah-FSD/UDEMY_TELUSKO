package com.java.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *A `LinkedList` in Java is a linear data structure that represents a collection of elements where each element
  is a separate object called a "node." In a `LinkedList`, each node points to the next node in the sequence, 
  forming a chain-like structure. There are two main types of linked lists in Java:

1. **Singly Linked List:** In a singly linked list, each node points to the next node in the sequence,
     but not to the previous node. It is used in scenarios where you need forward traversal.

2. **Doubly Linked List:** In a doubly linked list, each node points both to the next node 
     and the previous node in the sequence. It allows for forward and backward traversal.

Here are the key characteristics of `LinkedList`:

- **Dynamic Sizing:** Like `ArrayList`, `LinkedList` can grow or shrink as elements are added or removed.

- **Insertion and Deletion:** Inserting or deleting elements in a `LinkedList` is efficient because 
    it only requires updating references, not shifting elements.

- **Ordered:** `LinkedList` maintains the order of elements, making it suitable for
     scenarios where element order matters.

Now, let's discuss the time complexity of common operations in a `LinkedList`:

- **Insertion (Add an element at the beginning):** O(1)
  - Adding an element at the beginning of a `LinkedList` is fast because it only requires creating a 
    new node and updating references.

- **Insertion (Add an element at a specified index):** O(n)
  - Inserting an element at a specific index requires traversing the list to find the insertion point, which takes linear time.

- **Deletion (Remove an element at the beginning):** O(1)
  - Removing the first element is fast because it only requires updating references.

- **Deletion (Remove an element at a specified index):** O(n)
  - Removing an element at a specific index requires traversing the list to find the removal point,
    which takes linear time.

- **Access (Get or Set an element by index):** O(n)
  - Accessing elements in a `LinkedList` by index requires traversing the list to reach the desired node,
    which takes linear time.

- **Search (Find an element by value):** O(n)
  - Searching for an element in a `LinkedList` requires iterating through the 
    elements until the element is found, which takes linear time in the worst case.

Use `LinkedList` when you need efficient insertions or deletions at both the beginning and end of the list,
 and you don't require frequent random access by index.
 It's also useful when you want to maintain the order of elements. 
 However, keep in mind that `LinkedList` uses more memory compared to `ArrayList`
 due to the overhead of node objects.
 */
public class LinkedListClass {

	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("hello");
		linkedList.add("hi");
		
		
	}
}

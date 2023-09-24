package com.java.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * The map interface is present in java.util package represents a mapping between a key and a value. 
 * The Map interface is not a subtype of the Collection interface.
 * Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys. 
 *
 *	Maps are perfect to use for key-value association mapping such as dictionaries. 
 *  The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.
 * 	Some common scenarios are as follows: 

		A map of error codes and their descriptions.
		A map of zip codes and cities.
		A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
		A map of classes and students. Each class (key) is associated with a list of students (value).
		
	Characteristics of a Map Interface

	=>A Map cannot contain duplicate keys and each key can map to at most one value. 	
	  Some implementations allow null key and null values like the HashMap and LinkedHashMap, 
	  but some do not like the TreeMap.
	=>The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap 
	  have predictable orders, while HashMap does not.
	=>There are two interfaces for implementing Map in java. They are Map and SortedMap, and three classes:
	  HashMap, TreeMap, and LinkedHashMap.
	   
	 we can use Hashmap in consuming api by storing headers in map.
 * 
 *
 */
public class HashMapClass {

	public static void main(String[] args) {
		// Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();
  
        // Inserting pairs in above Map
        // using put() method
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
  
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me : map.entrySet()) {
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
        System.out.println(map.get("e")); // return the value of key. if key exists otherwise null
        map.put("a", 500); // overwrite existing key if present otherwise add key
        map.replace("a", 700); // replace key if it exists otherwise doesn't do anything
        System.out.println(map);	
	}
}

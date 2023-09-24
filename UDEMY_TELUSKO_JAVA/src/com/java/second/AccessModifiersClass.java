package com.java.second;

/**
 *Access Modifier: 
 * In Java, access modifiers are keywords used to control the visibility or accessibility of classes,
   methods, fields, and other members within a program. 
   
   There are four main access modifiers in Java:

1. public: Members declared as public are accessible from any other class or package. 
           There are no restrictions on their access.

2. private: Members declared as private are accessible only within the class in which they are declared.
            They are not visible outside of that class, not even in subclasses.

3. protected: Members declared as protected are accessible within the same class, within subclasses of same package
			  or other package,and within the same package.
			  They are not accessible from unrelated classes in different packages.

4. default (no modifier): Members with no access modifier (i.e., no `public`, `private`, or `protected` keyword) 
                          are also known as "package-private" or "default access." 
                          They are accessible within the same package but not from classes in different packages.

Keep in mind that access modifiers provide a way to encapsulate and control access to the internal details 
of classes, promoting data hiding and modularity in your Java programs. 
 */
public class AccessModifiersClass {
    
	public int publicField;
    private int privateField;
    protected int protectedField;
    int defaultField; // package-private (default access)
    
    public void publicMethod() {
        // Code accessible from anywhere
    }
    
    private void privateMethod() {
        // Code accessible only within this class
    }
    
    protected void protectedMethod() {
        // Code accessible within this class, subclasses, and same package
    }
    
    void defaultMethod() {
        // Code accessible within the same package
    }

}

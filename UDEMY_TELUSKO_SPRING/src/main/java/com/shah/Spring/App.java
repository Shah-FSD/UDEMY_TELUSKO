package com.shah.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         
     	Alien alien = (Alien) context.getBean("alien");
     	alien.code();
     	System.out.println(alien.getAge());
     	
     	((ClassPathXmlApplicationContext) context).close();
    
    }
}

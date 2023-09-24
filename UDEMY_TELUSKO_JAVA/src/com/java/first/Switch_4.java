package com.java.first;

/**
 *The switch statement in Java is used to perform different actions based on different conditions. 
 *It allows you to select one of many code blocks to be executed based on the value of a 
 *variable or an expression.
 *
 *break: statement is used to come out of switch, if we don't write it we will get all next statement
 *executed without any check.
 */
public class Switch_4 {

	public static void main(String[] args) {

		String day = "Monday";
		switch(day) {
			case "Sunday":
				System.out.println("1");	
				break;
			case "Monday":
				System.out.println("2");
				break;
			case "Wednesday":
				System.out.println("3");
				break;
			case "Thursday":
				System.out.println("4");
				break;
			case "Friday":
				System.out.println("5");
				break;
			
			default :
				System.out.println("Invalid day");		
		}		
	}

}

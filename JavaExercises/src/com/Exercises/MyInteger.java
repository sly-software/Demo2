package com.Exercises;


public class MyInteger {
	private int value;
	
	// Constructor to store the specified integer value 
	public MyInteger(int value) {
		this.value = value;
	}
	
	// Getter method for value
	public int getValue() {
		return value;		
	}
	
	// Test if even
	public boolean isEven() {
		if (value % 2 == 0) {return true;}
		else {return false;}
	}
	
	// Test if Odd
	public boolean isOdd() {
		if (value % 2 != 0) {return true;}
		else {return false;}
	}
	
	// Test if Prime
	public boolean isPrime() {
		boolean flag = false;
		if (value == 2) {flag = true;}
		
		else {
			for (int i = 2; i < value; i++) {		
				if (value % i == 0) {flag = false; break;}
				else {flag = true;}
			}			
		}
		return flag;						
	}
	
	// Test if even
	public static boolean isEven(int value) {
		if (value % 2 == 0) {return true;}
		else {return false;}
	}
	
	// Test if Odd
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {return true;}
		else {return false;}
	}
	
	// Test if Prime
	public static boolean isPrime(int value) {
		boolean flag = false;
		if (value == 2) {flag = true;}
		
		else {
			for (int i = 2; i < value; i++) {		
				if (value % i == 0) {flag = false; break;}
				else {flag = true;}
			}			
		}
		return flag;						
	}
	
	// Display the result
	@Override
	public String toString() {
		return "The value is: " + value;
	}
	
	
	
	/** The main method */
	public static void main(String[] args) {
		System.out.println();
	}
	

}

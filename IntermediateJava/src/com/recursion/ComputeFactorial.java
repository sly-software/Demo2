package com.recursion;

import java.util.Scanner;

public class ComputeFactorial {
	// The main method
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int n = input.nextInt();
		
		// Display factorial 
		System.out.println("Factorial of " + n + " is " + factorial(n));
		input.close();
	}
	
	/** Return the factorial for the specified number */
	public static long factorial(int n) {
		if (n == 0) // Base case
			return 1;
		else 
			return n * factorial(n - 1); // Recursive call
	}
}

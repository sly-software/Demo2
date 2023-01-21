package com.Exercises;

import java.util.Scanner;

public class Scanner_Ex {
	// The main method 
	public static void main(String[] args) {
		// The scanner object
		@SuppressWarnings("resource")
		Scanner inpuScanner = new Scanner(System.in);
		
		System.out.print("Enter the num1: ");
		double num1 = inpuScanner.nextDouble();
		
		System.out.print("Enter the num2: ");
		double numb2 = inpuScanner.nextDouble();
		
		// Display the results
		System.out.println("\nAdding " + num1 + " and " + numb2 + " is " +  (num1 + numb2));
		System.out.println("\nSubstracting " + num1 + " and " + numb2 + " is " +  (num1 - numb2));
		System.out.println("\nMultipying " + num1 + " and " + numb2 + " is " +  (num1 * numb2));
		System.out.println("\nDividing " + num1 + " and " + numb2 + " is " +  (num1 / numb2));
		
	}

}

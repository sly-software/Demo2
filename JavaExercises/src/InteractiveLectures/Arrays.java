package InteractiveLectures;

import java.util.Scanner;

public class Arrays {
	// The main method
	public static void main(String[] args) {
		// The scanner object
		Scanner input = new Scanner(System.in);
		
		// Initializing an empty array
		int[] ages = new int [7];
		
		// For loop to add ages to the array
		System.out.print("Enter the ages: ");
		for (int i = 0 ; i < 7; i++) {
			ages[i] = input.nextInt();
		}
		
		// Sort the array
		java.util.Arrays.sort(ages);
		
		// Display results
		System.out.println();
		System.out.println("The Youngest age is: " + ages[0]);
		System.out.println("The Oldest age is: " + ages[6]);
		input.close();  // close the scanner
		
	}

}

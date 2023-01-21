package com.TestJavaExercises;

import com.Exercises.Circle2D;

public class TestCircle2D {
	// The main method 
	public static void main(String[] args) {
		// Testing the overlap method
		System.out.println("Display true if circles overlap otherwise false");
		Circle2D newCircle = new Circle2D(2, 2, 5.5);
		System.out.println(newCircle.overlapsCircle(new Circle2D(3, 5, 2.3)));
			
		// Testing the contain method
		System.out.println("\nDisplay true if given circles is contained within the other otherwise false");
		System.out.println(newCircle.containsCircle(new Circle2D(4, 5, 10.5)));
		
		// Testing the contain point method
		System.out.println("\nDisplay true if given point is contained within the circle area otherwise false");
		System.out.println(newCircle.containsPoint(3, 3));
		}
}

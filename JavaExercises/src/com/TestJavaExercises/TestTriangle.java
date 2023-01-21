package com.TestJavaExercises;

import com.Exercises.MyPoint;
import com.Exercises.Triangle2D;

public class TestTriangle {
	// The main method
	public static void main(String[] args) {
		// Test the default constructor
		System.out.println("TESTING DEFAULT CONSTRUCTOR..");
		Triangle2D triangle1 = new Triangle2D();
		System.out.println("Area 1");
		System.out.println(triangle1.getArea());
		
		System.out.println("\nPerimeter 1");
		System.out.println(triangle1.getPerimeter());
		
		// Test the other constructor
		System.out.println("\nTESTING THE OTHER CONSTRUCTOR INITIALIZED..");
		Triangle2D triangle2 = new Triangle2D(new MyPoint(2.5, 2), 
				new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		
		System.out.println("Area 2");
		System.out.println(triangle2.getArea());
		
		System.out.println("\nPerimeter 2");
		System.out.println(triangle2.getPerimeter());
		
	}


}

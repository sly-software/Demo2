package com.TestJavaExercises;

import com.Exercises.MyPoint;

public class TestMyPoint {
	// The main method
	public static void main(String[] args) {
		MyPoint obj1 = new MyPoint(10, 30.5);
		MyPoint obj2 = new MyPoint();
		
		System.out.println(MyPoint.distance(obj1, obj2));
	}
}

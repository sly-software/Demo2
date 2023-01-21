package com.Exercises;

public class Triangle2D {
	// Attributes
	MyPoint p1;
	MyPoint p2;
	MyPoint p3;
	
	// No args constructor 
	public Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}
	
	// with args constructor 
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		setPoints(p1, p2, p3);
	}
	
	// Compute perimeter
	public double getPerimeter() {
		// Computing the sides
		double a = MyPoint.distance(p2, p1);
		double b = MyPoint.distance(p2, p3);
		double c = MyPoint.distance(p3, p1);
		
		// Computing the semi-perimeter
		return a + b + c;
	} 
	
	// Compute Area
	public double getArea() {
		// We are using Heron's formula sqrt[s{(s-a)(s-b)(s-c)}], 
		// were s is semi-perimeter, and a, b, c are there sides of the triangle
		
		// Computing the sides
		double a = MyPoint.distance(p2, p1);
		double b = MyPoint.distance(p2, p3);
		double c = MyPoint.distance(p3, p1);
		
		// Computing the semi-perimeter
		double s = getPerimeter()/2.0;
		
		// Computing the area 
		return Math.sqrt(s * ((s-a)*(s-b)*(s-c)));		
	}
	
	// Setter method for p1
	public void setPoints(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = new MyPoint(p1.getX(), p1.getY());
		this.p2 = new MyPoint(p2.getX(), p2.getY());
		this.p3 = new MyPoint(p3.getX(), p3.getY());
	}

}

package com.Exercises;

public class Circle2D {
	// Attributes  
	private double x;
	private double y;
	private double radius;
	
	// Constructor no-args
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	// Constructor with-args
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Contain method
	public boolean containsPoint(double x, double y) {
		// compute distance between circle center and point
		MyPoint pointObj = new MyPoint(this.x, this.y);
		double distance = pointObj.distance(x, y);
		
		if (distance <= this.radius) {return true;}
		else {return false;}		
	}
	
	// compute distance between circle centers
	public boolean containsCircle(Circle2D circle) {
		// variables 
		double largerRadius = 0;
		double smallerRadius = 0;
				
		// Determine large/small radius 
		if (this.getRadius() > circle.getRadius()) {
			smallerRadius = circle.getRadius();
			largerRadius = this.getRadius();
		}	
		else {
			smallerRadius = this.getRadius();
			largerRadius = circle.getRadius();
		}
		
		// compute distance between circles center
		MyPoint pointObj = new MyPoint(this.getX(), this.getY());
		double distance = pointObj.distance(circle.getX(), circle.getY());
			
		// Check if circle is contained in this circle 
		if (distance + smallerRadius <= largerRadius) {return true;}
		else {return false;}		
	}
	
	// Overlapping circle 
	public boolean overlapsCircle(Circle2D circle) {
		// compute distance between circles center
		MyPoint pointObj = new MyPoint(this.getX(), this.getY());
		double distance = pointObj.distance(circle.getX(), circle.getY());
		
		// Determine which is greater between sum of radiuses and distance
		if ((this.getRadius() + circle.getRadius() > distance) && (this.containsCircle(circle)) != true){return true;}
		else {return false;}
	}
	
	// Compute area 
	public double getArea() {
		return Math.PI * radius * radius; 
	}
	
	// Compute perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}	
	
	// Radius getter 
	public double getRadius() {
		return radius;
	}
	
	// X getter 
	public double getX() {
		return x;
	}
	
	// Y getter 
	public double getY() {
		return y;
	}
	
}

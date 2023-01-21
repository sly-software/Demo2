package com.Exercises;


public class MyPoint {
	// Data fields 
	private double x;
	private double y;
	
	// No arg constructor
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	// With args constructor
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Distance method
	public double distance() {
		return Math.sqrt(Math.pow(Math.abs(x), 2) + 
				Math.pow(Math.abs(y), 2));
	}
	
	// Helper method isNegative or isPositive
	public boolean isPositive(double variable) {
		if (variable < 0) {return false;}
		else {return true;}
	}

	// Distance method with args
	public double distance(double x, double y) {
		// Check weather the x/y both are negative/positive
		double result = 0;
		if ((isPositive(y) == isPositive(this.y)) && (isPositive(x) == isPositive(this.x))) {
			double changeX = Math.abs(x - this.x);
			double changeY = Math.abs(y - this.y);
			result =  Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
		}
		
		// Check weather the distance moved by x span the number line in both sides
		else if ((isPositive(y) == isPositive(this.y)) && (isPositive(x) != isPositive(this.x))) {
			double changeX = Math.abs(x + this.x);
			double changeY = Math.abs(y - this.y);
			result =  Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
		}
		
		// Check weather the distance moved by y span the number line in both sides
		else if ((isPositive(y) != isPositive(this.y)) && (isPositive(x) == isPositive(this.x))) {
			double changeX = Math.abs(x - this.x);
			double changeY = Math.abs(y + this.y);
			result =  Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
		}
		
		// Check weather the distance moved by x and y span the number line in both sides
		else if ((isPositive(y) != isPositive(this.y)) && (isPositive(x) != isPositive(this.x))) {
			double changeX = Math.abs(x) + Math.abs(this.x);
			double changeY = Math.abs(y) + Math.abs(this.y);
			result =  Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
		}
		return result;
	}
	
	// Static method return distance by comparing two objects 
	public static double distance(MyPoint obj1, MyPoint obj2) {
		return obj1.distance(obj2.getX(), obj2.getY());	
	}
	
	// Setter method for x
	public void setX(Double x) {
		this.x = x;
	}
	
	// Setter method for y
	public void setY(Double y) {
		this.y = y;
	}
	
	// Getter method for Y
	public double getY() {
		return y;
	}
	
	// Getter method for X
	public double getX() {
		return x;
	}

}

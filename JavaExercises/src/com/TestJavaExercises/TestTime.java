package com.TestJavaExercises;

import com.Exercises.Time;

public class TestTime {
	/** The main method */
	public static void main(String[] args) {
		System.out.println("The program is started\n");
		
		// instantiating default no args constructor
		Time timeDefaut = new Time();
		System.out.println("The current time!! ");
		System.out.println(timeDefaut.toString());
		System.out.println();
		
		// instantiating constructor with specified time elapsed
		Time timeSpecified = new Time(555560000);
		System.out.println("Dispalying time fom specified timeElapsed: ");
		System.out.println(timeSpecified.toString());
		System.out.println();
		
		// instantiating constructor with specified hour, minute and seconds
		Time timeValues = new Time(20, 35, 59);
		System.out.println("Dispalying time fom specified timeValues: ");
		System.out.println(timeValues.toString());
		System.out.println();
		
	}

}

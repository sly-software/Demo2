package com.Exercises;

public class Time {
	// Data fields
	private long hour;
	private long minutes;
	private long seconds;
	
	// Default no args constructor
	public Time() {
		setTime(System.currentTimeMillis());
	}
	
	// Constructor with specified time elapsed 
	public Time(long timeElapsed) {
		setTime(timeElapsed);
	}
	
	// Constructor with specified hour, minute and seconds
	public Time(long hour, long minute, long seconds) {
		setHour(hour);
		setMinutes(minute);
		setSeconds(seconds);
	}
	
	// Set time method
	public void setTime(long timeElapsed) {
		long totalSeconds = timeElapsed / 1000;
		// set current second
		setSeconds(totalSeconds % 60);
		
		// Total minutes
		long totalMinutes = totalSeconds / 60;
		// set current minute
		setMinutes(totalMinutes % 60);
		
		// Total Hours 
		long totalHours = totalMinutes / 60;
		// current hour
		setHour(totalHours % 24);
		
	}
	
	// Setter method for hour 
	private void setHour(long hour) {
		this.hour = hour;
	}
	
	// Setter method for minutes
	private void setMinutes(long minutes) {
		this.minutes = minutes;
	}
	
	// Setter method for seconds 
	private void setSeconds(long seconds) {
		this.seconds = seconds;
	}
	
	// Getter method for hour 
	public long getHour() {
		return hour;
	}
	
	// Getter method for minutes 
	public long getMinutes() {
		return minutes;
	}
	
	// Getter method for Seconds 
	public long getSeconds() {
		return seconds;
	}
	
	// Display time
	@Override
	public String toString() {
		return "The Time is " + hour + ":" + minutes + ":" + seconds + " GMT";
	}
	

}

package com.csci360.activitytracker.model;

public class HeartRate {
	
	//this method takes the past 20 heart rate readings (random)
	//and returns an average 
	public static int average() {
		int total = 0;
		for(int i = 0; i < 20; i++) {
			total+=rng();
		}
		return total/20;
	}
	
	public static int[] hrLog(int x) {
		int[] heartRates = new int[x];
		for(int i = 0; i < x; i++) {
			heartRates[i] = average();
		}
		return heartRates;
	}
	
	
	
	
	//this method generates random integers between 120 and 45
	//to simulate heart rate
	public static int rng() {
		return (int) ((Math.random()*(120 - 45)) + 45);
	}
}

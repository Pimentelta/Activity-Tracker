package com.csci360.activitytracker.model;

public class HeartRate {
	public static int[] heartRates = new int[50]; //generate empty array to store heartRates
	public static int count = 0; //count is the x value on heart rate chart
	
	//this method takes the past 5 heart rate readings
	//and returns an average to be graphed
	public static int average(int[] pastFive) {
		int total = 0;
		//sum and divide to get average
		for(int i = 0; i < pastFive.length; i++) {
			total+=pastFive[i];
		}
		return total/pastFive.length;
	}
	
	//this method takes an integer value of heart rate
	//and appends it to heartRates array to be graphed
	public static void updateHR(int hr) {
		heartRates[count] = hr;
		count++;
	}
	//this method generates random integers between 120 and 45
	//to simulate heart rate
	public static int rng() {
		return (int) ((Math.random()*(120 - 45)) + 45);
	}
	public static void main(String[] args) {
		//make new array of length 5
		int[] five = new int[5];
		//generate 5 heart rate data points 50 times
		//and send to heartRates array
		for( int i=0; i<50; i++) {
			for (int j = 0; j<5; j++) {
				five[j] = rng();
			}
			//average the 5 data points
			int average = average(five);
			//send the average of the 5 data points to be
			//stored in the heartRates[] array
			updateHR(average);
		}
		//this prints the heart rates that should be graphed
		for(int i = 0; i < heartRates.length; i++) {
			System.out.println(heartRates[i]);
		}
	}
}
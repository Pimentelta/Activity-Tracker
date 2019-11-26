package com.csci360.activitytracker.model;

public class sleep {
	public static boolean[] sleepLog = new boolean[50];
	public static double restingHeartRate = 75.0; //75 is a hardcoded value to test the class
	//this value would normally be provided by the user
	public static boolean isAsleep(int heartRate) {
		double hrPercent = heartRate/restingHeartRate; //hrPercent represents current heart rate as a fraction over resting heart rate
		if(hrPercent < .85) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testHR[] = new int[50];
		System.out.println("60/75 = "+ 60/75.0);
		
		//these loops make an array of heart rates over time
		//to test the isAsleep method
		for(int i = 0; i < 10; i ++) {
			testHR[i]=80;
		}
		for( int i = 10; i < 25; i++) {
			testHR[i] = 60;
		}
		for(int i = 25; i <50; i++) {
			testHR[i] = 75;
		}
		//pass the heart rates as the data comes in to
		//determine if the user is asleep
		//this method writes to sleepLog with a true or false
		for ( int i = 0; i < testHR.length; i++) {
			sleepLog[i] = isAsleep(testHR[i]);
		}
		
		//print values of sleepLog to make sure index
		//10 to 24 are true bc heart rate/resting hr < 0.8
		for(int i = 0; i < sleepLog.length; i++) {
			System.out.println(sleepLog[i]);
		}
		}
	}



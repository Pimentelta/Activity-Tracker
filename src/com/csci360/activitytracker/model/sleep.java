package com.csci360.activitytracker.model;
/*
 * rem sleep 40 to 49
	deep sleep 50 to 59
	light sleep 60 to 75
	awake is above 75
 */
public class sleep {
	//public static boolean[] sleepLog = new boolean[50];
	public static double restingHeartRate = 75.0; //75 is a hardcoded value to test the class
	//this value would normally be provided by the user
	public static String dates;
	public static String types;
	public static String amounts;
	public sleep(String dates, String sleep.calculateType(String dates, String amounts) , String amounts) {
		sleep.dates = dates;
		sleep.types = types;
		sleep.amounts=amounts;
	}
	public static boolean isAsleep(int heartRate) {
		double hrPercent = heartRate/restingHeartRate; //hrPercent represents current heart rate as a fraction over resting heart rate
		if(hrPercent < .85) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void calculateType1(String dates, String amounts) {
		
	}
	public static boolean[] makeSleepLog(int[] heartRates) {
		boolean[] sleepArr = new boolean[heartRates.length];
		
		//loops through passed array and returns an array of
		//booleans representing whether or not the user was asleep
		for(int i = 0; i < heartRates.length; i++) {
			sleepArr[i] = isAsleep(heartRates[i]);
		}
		return sleepArr;
//		int testHR[] = new int[50];
//		System.out.println("60/75 = "+ 60/75.0);
//		
//		//these loops make an array of heart rates over time
//		//to test the isAsleep method
//		for(int i = 0; i < 10; i ++) {
//			testHR[i]=80;
//		}
//		for( int i = 10; i < 25; i++) {
//			testHR[i] = 60;
//		}
//		for(int i = 25; i <50; i++) {
//			testHR[i] = 75;
//		}
//		//pass the heart rates as the data comes in to
//		//determine if the user is asleep
//		//this method writes to sleepLog with a true or false
//		for ( int i = 0; i < testHR.length; i++) {
//			sleepLog[i] = isAsleep(testHR[i]);
//		}
		
		//print values of sleepLog to make sure index
		//10 to 24 are true bc heart rate/resting hr < 0.8
		//for(int i = 0; i < sleepLog.length; i++) {
			//System.out.println(sleepLog[i]);
		}
		}
	



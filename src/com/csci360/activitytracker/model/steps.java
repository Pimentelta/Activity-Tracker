package com.csci360.activitytracker.model;

public class steps {
	public static int[] stepsArray = new int[50];
	public static int count = 0;
	
	public int[] getArray() {
		for (int i = 0; i < 50; i++) {
			addSteps(rng());
		}
		for (int i = 0; i < 50; i++) {
			System.out.println(stepsArray[i]);
		}
		return stepsArray;
	}
	
	public static int rng() {
		return (int) ((Math.random()*(100 - 1)));
	}
	
	public static void addSteps(int steps) {
		try {
			stepsArray[count] =  stepsArray[count-1]+steps;
			count++;
		}
		catch(Exception e){
			stepsArray[count]=steps;
			count++;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

package com.csci360.activitytracker.model;

/*
 * Simulator for steps using a random number generator.
 */
public class steps {
	public static int[] stepsArray = new int[50];
	public static int count = 0;
	
	
	public static int rng() {
		return (int) ((Math.random()*(100 - 1)));
	}
	/*
	 * Accumulates how many steps were taken over time into an array that will be read later. 
	 */
	public static int[] addSteps(int steps) {
		int[] stepCounter = new int[steps];
		stepCounter[0]= 0;
		for (int i = 1; i < steps; i++) {
			stepCounter[i] = stepCounter[i-1]+rng();
		}
		return stepCounter;
	}
	
}
		

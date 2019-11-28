package com.csci360.activitytracker.model;
import java.lang.Math;
public class Calories {
	private int weight = Person.getPerson().getWeight();
	private int height = Person.getPerson().getHeight();
	private int age= Person.getPerson().getAge();
	
	
	public double caloriesBurned(int steps) throws Exception {

		/*
		//Assuming MET method of calculating calories burned (MET Score * Weight in kg * hours exercising. Running has a MET score of approximately 7, whereas walking is 3.
		  double kg = weight/2.2;		   //double
		   int metScore = (int) ((Math.random()*(7 - 3)) + 3);
		   double tExer = ((Math.random()*(3 - 0.25)) + 0.25); //double
		   return Math.floor(metScore * kg * tExer);
		 */
		//BMR method uses age, height, and weight to calculate how many calories were burned. 
		   return Math.floor(66 +  (steps/240) * (6.2 * weight) + (12.7 * height) - (6.76 * age) *((Math.random()*(1.6 - 0.9)) + 0.9)); //double is returned to an integer
	}

	
	
}
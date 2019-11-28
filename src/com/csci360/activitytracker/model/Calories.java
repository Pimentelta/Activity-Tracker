package com.csci360.activitytracker.model;
import java.lang.Math;
public class Calories {
	private int weight = Person.getPerson().getWeight();
	private int height = Person.getPerson().getHeight();
	private int age= Person.getPerson().getAge();
	
	//  height(inches)*.42=stride(inches)
	//  stride*steps = distance traveled in inches
	//  distance in inches/12*5280 = distance in miles
	//  .53*weight in lbs = cal/mile
	//  miles*cal/mile = calories burned
	// math.floor(val*100)/100 to round two the hundredth place
	
	public double caloriesBurned(int steps) throws Exception {
//		double stride = height*.42;
//		double distIn = steps * stride;
//		double distMi = distIn/(12*5280);
//		double calMile = weight*.53;
//		double calsBurned = calMile * distMi;
//		double rounded = Math.floor(calsBurned*100)/100;
//		return rounded;
		/*
		//Assuming MET method of calculating calories burned (MET Score * Weight in kg * hours exercising. Running has a MET score of approximately 7, whereas walking is 3.
		  double kg = weight/2.2;		   //double
		   int metScore = (int) ((Math.random()*(7 - 3)) + 3);
		   double tExer = ((Math.random()*(3 - 0.25)) + 0.25); //double
		   return Math.floor(metScore * kg * tExer);
		 */
		//BMR method 
		   return Math.floor(66 +  (steps/240) * (6.2 * weight) + (12.7 * height) - (6.76 * age) *((Math.random()*(1.6 - 0.9)) + 0.9)); //double
		//return  Math.floor(((height*.42*steps)/(12*5280)*.53*weight)*100)/100;
		//return 10*weight*
	}
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
}
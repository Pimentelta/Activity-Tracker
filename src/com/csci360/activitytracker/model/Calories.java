package com.csci360.activitytracker.model;
import java.lang.Math;
public class Calories {
	public int weight = 155;
	public int height = 72;
	
	//  height(inches)*.42=stride(inches)
	//  stride*steps = distance traveled in inches
	//  distance in inches/12*5280 = distance in miles
	//  .53*weight in lbs = cal/mile
	//  miles*cal/mile = calories burned
	// math.floor(val*100)/100 to round two the hundredth place
	
	public double caloriesBurned(int steps) {
//		double stride = height*.42;
//		double distIn = steps * stride;
//		double distMi = distIn/(12*5280);
//		double calMile = weight*.53;
//		double calsBurned = calMile * distMi;
//		double rounded = Math.floor(calsBurned*100)/100;
//		return rounded;
		
		return  Math.floor(((height*.42*steps)/(12*5280)*.53*weight)*100)/100;
	}
	
}


//FOR--TINO--TINO--TINO--TINO--TINO READ ME PLEASE
//Remove this before turning in
//Height in inches and weight in lbs are currently hardcoded at the top
//They instead need to be passed based on the users height and weight
//the commented section in caloriesburned is the same thing as the uncommented
//the comments above the method explain whats going on in the method
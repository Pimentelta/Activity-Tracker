package com.csci360.activitytracker.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PTime {
	private static PTime instance= new PTime(); //singleton pattern from GoF
	private static String newhour= "00:00";
	private static String ap = "AM";
	private static String hourParsed = String.valueOf(newhour.charAt(0)) + String.valueOf(newhour.charAt(1));
	private static String time; //11 and 12 = hour. 17 and 18 = am/pm
	public static boolean changed = false;
	public static boolean changed2= false;
	private PTime() {}
	
	public static synchronized PTime getInstance() {
		if(instance ==null) instance = new PTime();
		return instance;
	}
	public static void setHour(String time) { //change time to whatever is set from the ChangeTime menu
		if (time != null) {
            switch(time) {
              case "01:00": newhour = time; changed = true; break;
              case "02:00": newhour = time; changed = true; break;
              case "03:00": newhour = time; changed = true; break;
              case "04:00": newhour = time; changed = true; break;
              case "05:00": newhour = time; changed = true; break;
              case "06:00": newhour = time; changed = true; break;
              case "07:00": newhour = time; changed = true; break;
              case "08:00": newhour = time; changed = true; break;
              case "09:00": newhour = time; changed = true; break;
              case "10:00": newhour = time; changed = true; break;
              case "11:00": newhour = time; changed = true; break;
              case "12:00": newhour = time; changed = true; break;
            }
		}
		//hour = time;
	}
	public static String getHour() {//when successfully parsed and implemented, make sure to set this to getting the new Time
		return newhour;
	}
	public static void setMeridian(String newM) {//change meridian to whatever is set from the ChangeTime menu
		ap = newM; changed2 = true;
	}
	public static String getMeridian() {//when successfully parsed and implemented, make sure to set this to getting the new Time
		return ap;
	}
	public static String getTime() { //more work to be done. needs to use the variables adjusted and 
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");//17 and 18 are am/pm
		String dateString = dateFormat2.format(new Date()).toString();//returns the full unedited time
		//StringBuilder tim = new StringBuilder(dateString);
		if(changed || changed2) {
			//hours are characters 11 and 12 whereas 17 and 18 = am/pm
			String oldt = dateString.substring(0,10);//before the hour
			String oldminute = dateString.substring(13,16) + " ";//between the hour and AM/PM
			String oldampm = dateString.substring(17,18); //the AM/PM itself
			String oldh = dateString.substring(11,12);//the hour itself
			String h= " " + newhour.substring(0,2);//actual hour from combobox. 
			String a= ap;//actual AM/PM from combobox. 
			String tim;//tim will be the new string that we build using the old and new time information
			if(changed && !(changed2)) tim = oldt+ h+ oldminute + oldampm;
			if(!(changed) && changed2) tim = oldt+ oldh+ oldminute + a;
			else tim = oldt+ h+ oldminute + a;
			//System.out.println(tim); //will spam the new time within TimeChange menu
			return tim;
		}
		else return dateString;
		
	}
}

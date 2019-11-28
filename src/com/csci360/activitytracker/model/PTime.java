package com.csci360.activitytracker.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PTime {
	private static PTime instance= new PTime(); //singleton pattern from GoF
	private static String hour= "00:00";
	private static String ap;
	private static String hourParsed = String.valueOf(hour.charAt(0)) + String.valueOf(hour.charAt(1));
	private static String time; //11 and 12 = hour. 17 and 18 = am/pm
	/*
	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");//17 and 18 are am/pm
	String dateString2 = dateFormat2.format(new Date()).toString();
	System.out.println("Current date and time in AM/PM: "+dateString2);
	int newTime = dateString2.charAt(11)+dateString2.charAt(12);
	newTime = 7;
	StringBuilder time = new StringBuilder(dateString2);
	time.setCharAt(12, (char)(newTime));//ends up with a question mark 
	//dateString2[11] = newTime;//(dateString2[0-10]+newTime+dateString2[13-18]);
	clock.setText(dateString2);
	System.out.println("Current hour "+dateString2.charAt(11)+dateString2.charAt(12));//11 and 12 are hour
	System.out.println("new time: " + time);
	*/
	private PTime() {}
	
	public static synchronized PTime getInstance() {
		if(instance ==null) instance = new PTime();
		return instance;
	}
	public static void setHour(String time) { //change back to int if this doesn't work
		if (time != null) {
            switch(time) {
              case "01:00": hour = time; break;
              case "02:00": hour = time; break;
              case "03:00": hour = time; break;
              case "04:00": hour = time; break;
              case "05:00": hour = time; break;
              case "06:00": hour = time; break;
              case "07:00": hour = time; break;
              case "08:00": hour = time; break;
              case "09:00": hour = time; break;
              case "10:00": hour = time; break;
              case "11:00": hour = time; break;
              case "12:00": hour = time; break;
            }
		}
		//hour = time;
	}
	public static String getHour() {
		return hour;
	}
	public static void setMeridian(String newM) {
		ap = newM;
	}
	public static String getMeridian() {
		return ap;
	}
	public static String getTime() {
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");//17 and 18 are am/pm
		String dateString = dateFormat2.format(new Date()).toString();
		StringBuilder tim = new StringBuilder(dateString);
		int newTime = dateString.charAt(11)+dateString.charAt(12); //hours are characters 11 and 12 whereas 17 and 18 = am/pm
		tim.setCharAt(12, (char)(newTime));//
		return dateString;
	}
}

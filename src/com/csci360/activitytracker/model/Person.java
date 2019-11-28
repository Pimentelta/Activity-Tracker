package com.csci360.activitytracker.model;
/*
 * Uses a singleton design pattern to keep track of the users goal, age, weight, and height
 */
public class Person {
	public static int goal = 1000;
	public static int age =20;
	public static int weight = 100;
	public static int height = 49;
	private static Person user = new Person(); //singleton pattern from GoF
	
	private Person() {}
	public static synchronized Person getPerson() {
		if(user ==null) user = new Person();
		return user;
		}
	
	 public static int getGoal() {
			return Person.goal;
		}
	 public static void setGoal(int newG) {
		 Person.goal = newG;
	 }

	 public static int getHeight() {
			return height;
		}
	 public static void setHeight(int newH) {
		 height = newH;
	 }
	 public static int getWeight() {
			return weight;
		}
	 public static void setWeight(int newW) {
		 weight = newW;
	 }
	 public static int getAge() {
			return age;
		}
	 public static void setAge(int newA) {
		 age = newA;
	 }
}

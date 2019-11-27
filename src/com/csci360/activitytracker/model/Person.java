package com.csci360.activitytracker.model;

import javafx.beans.property.StringProperty;

public class Person {
	public static int goal = 1000;
	public static int age =20;
	public static int weight = 100;
	public static int height = 49;
	//protected StringProperty name;
	public static Person[] pList;
	/*public Person (String name) //creates a person with a name.
	{
		this.name.set(name);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	 public StringProperty getNameProperty() {
		 return name;
	 }*/
	 public static int getGoal() {
			return Person.goal;
		}
	 public static void setGoal(int newG) {
		 Person.goal = newG;
	 }
	 public static void addPerson(Person p) {
		 pList[0]=p;
	 }
	 public Person getPerson() {
		 return pList[0];
	 }
	 public static int getHeight() {
			return Person.height;
		}
	 public static void setHeight(int newH) {
		 Person.height = newH;
	 }
	 public static int getWeight() {
			return Person.height;
		}
	 public static void setWeight(int newW) {
		 Person.weight = newW;
	 }
	 public static int getAge() {
			return Person.height;
		}
	 public static void setAge(int newA) {
		 Person.age = newA;
	 }
}

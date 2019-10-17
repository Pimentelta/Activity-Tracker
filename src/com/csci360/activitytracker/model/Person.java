package com.csci360.electionapp.model;

import javafx.beans.property.StringProperty;

public class Person {

	protected StringProperty name;
	
	public Person (String name) //creates a person with a name.
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
	 }
}

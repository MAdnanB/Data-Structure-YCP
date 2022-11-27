package com.Q5;

public class Passenger {
	private String Name;
	private int Age;
	private String Contact;
	
	public Passenger(String name, int age, String contact) {
		
		Name = name;
		Age = age;
		Contact = contact;
	}

	public Passenger() {
		
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	@Override
	public String toString() {
		return "Passenger [Name=" + Name + ", Age=" + Age + ", Contact= +91-"
				+ Contact + "]";
	}
	
	
	
	
	
}

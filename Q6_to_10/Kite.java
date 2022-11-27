package com.Q6_to_10;

public class Kite{
	String color;
	String owner;
	int length;
	boolean flyingStatus;
	
	Kite next;
	
	public Kite(String color, String owner, int length, boolean flyingStatus) {
		                              
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flyingStatus = flyingStatus;
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length="
				+ length + ", flyingStatus=" + flyingStatus + "]";
	}
	
	
}

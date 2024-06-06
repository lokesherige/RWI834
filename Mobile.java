package com.HasARelation;

public class Mobile {
	
	OperatingSystem os=new OperatingSystem("Macbook", "AppleM1");
	
	public void Charger(Charger c) {
		System.out.println(c);
	}
}

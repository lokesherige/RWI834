package com.HasARelation;

public class Charger {

	private String name;
	private String brand;

	public Charger(String name, String brand) {
		this.brand=brand;
		this.name=name;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Charger [name=" + name + ", brand=" + brand + "]";
	}
	
}

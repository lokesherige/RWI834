package com.HasARelation;

public class MobileApp {
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getProcessorType());
		Charger c=new Charger("white","Realme");
		m.Charger(c);
	}
}

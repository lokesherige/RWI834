package com.HasARelation;

public class OperatingSystem {
	
	 private String name;
	 private String processorType;
	 
	 public OperatingSystem(String name,String processorType) {
		 this.name=name;
		 this.processorType=processorType;
	 }
	 
	 //getter for the Operating System
	 public String getName() {
		 return name;
	 }
	 public String getProcessorType() {
		 return processorType;
	 }

	@Override
	public String toString() {
		return "OperatingSystem [name=" + name + ", processorType=" + processorType + "]";
	}
	 
}

package com.rhocorp;

public class GamingSpeaker extends Speaker{
	private String setup;
	
	public GamingSpeaker(String brand, String model, String dimensions, String color, String bass, String impedance, String frequency, double weight, int power, int sensitivity) {
		super(brand, model, dimensions, color, bass, impedance, frequency, weight, power, sensitivity);
	}
	
	public String getSetup() {
		return this.setup;
	}
	
	public void setSetup(String setup) {
		this.setup = setup;
	}
	
	public void print() {
		System.out.println("Gaming setup");
	}
	
	public void noDetails() {
		System.out.print(" (No Details!!)");
	}
}


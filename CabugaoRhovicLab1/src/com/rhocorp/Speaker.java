package com.rhocorp;

public class Speaker {

	private String model;
	private String dimensions;
	private String color;
	private String bass;
	private String impedance;
	private String frequency;
	private String brand;
	private double weight;
	private int power;
	private int sensitivity;
	
	public Speaker(String brand, String model, String dimensions, String color, String bass, String impedance, String frequency, double weight, int power, int sensitivity) {
		this.model = model;
		this.dimensions = dimensions;
		this.color = color;
		this.bass = bass;
		this.impedance = impedance;
		this.frequency = frequency;
		this.weight = weight;
		this.power = power;
		this.brand = brand;
		this.sensitivity = sensitivity;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getDimensions() {
		return this.dimensions;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBass() {
		return this.bass;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getImpedance() {
		return this.impedance;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getSensitivity() {
		return this.sensitivity;
	}
	
	public String getFrequency() {
		return this.frequency;
	}
}

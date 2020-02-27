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
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getDimensions() {
		return this.dimensions;
	}
	
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBass() {
		return this.bass;
	}
	
	public void setBass(String bass) {
		this.bass = bass;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getImpedance() {
		return this.impedance;
	}

	public void setImpedance(String impedance) {
		this.impedance = impedance;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getSensitivity() {
		return this.sensitivity;
	}
	
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}
	
	public String getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public void listAllBrand(String a, String b, String c) {
		System.out.println(a + "\n" + b + "\n" + c);
	}
}

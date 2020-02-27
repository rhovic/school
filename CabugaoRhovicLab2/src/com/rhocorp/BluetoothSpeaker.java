package com.rhocorp;

public class BluetoothSpeaker extends Speaker{
	private String bluetooth;
	
	public BluetoothSpeaker(String brand, String model, String dimensions, String color, String bass, String impedance, String frequency, double weight, int power, int sensitivity) {
		super(brand, model, dimensions, color, bass, impedance, frequency, weight, power, sensitivity);
	}
	
	public String getbluetooth() {
		return this.bluetooth;
	}
	
	public void setbluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
		}
	
	public void print(int avi) {
		if(avi > 1 || avi < 0) {
			System.out.println("Does not exist!!");
		}
		else if(avi == 1) {
			System.out.println("Bluetooth Available!!");
		}
		else {
			System.out.println("Bluetooth Not Available!!");
		}
	}
	
	public void noDetails() {
		System.out.print(" (No Details!!)");
	}
	
}

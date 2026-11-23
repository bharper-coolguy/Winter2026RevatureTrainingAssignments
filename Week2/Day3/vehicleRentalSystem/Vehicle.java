package com.day3.vehicleRentalSystem;

public class Vehicle {
	protected String vehicleNumber;
	protected String model;
	protected double ratePerDay;
	protected int days;
	
	public Vehicle(String vehicleNum, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNum;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public double calculateRent() {
		return ratePerDay * days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle number: " + this.vehicleNumber +
				", Model: " + this.model +
				", Rate per day: "+ this.ratePerDay +
				", Days: " + this.days);
	}

}

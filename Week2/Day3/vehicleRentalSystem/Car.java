package com.day3.vehicleRentalSystem;

// This class is an example of inheritance.
public class Car extends Vehicle{
	private double insuranceCharge;
	
	public Car(String vehicleNum, String model, double ratePerDay, int days, double insuranceCharge) {
		super(vehicleNum, model, ratePerDay, days);
		this.insuranceCharge = insuranceCharge;
	}
	
	@Override
	public double calculateRent() {
		return super.calculateRent() + (insuranceCharge * days);
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Vehicle number: " + this.vehicleNumber +
				", Model: " + this.model +
				", Rate per day: "+ this.ratePerDay +
				", Days: " + this.days +
				", Insurance charge: " + insuranceCharge);
	}
	
	@Override
	public String toString() {
		return "Car   | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.calculateRent();  
	}
}

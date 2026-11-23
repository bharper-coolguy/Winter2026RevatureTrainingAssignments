package com.day3.vehicleRentalSystem;

// This class is an example of inheritance!
public class Bike extends Vehicle{
	
	public Bike(String vehicleNum, String model, double ratePerDay, int days) {
		super(vehicleNum, model, ratePerDay, days);
	}
	@Override
	public double calculateRent() {
		return super.calculateRent() * 0.9;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Vehicle number: " + this.vehicleNumber +
				", Model: " + this.model +
				", Rate per day: "+ this.ratePerDay +
				", Days: " + this.days);
		System.out.println("Because you're renting a bike, you get 10% off!");
	}
	
	@Override
	public String toString() {
		return "Bike  | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.calculateRent();  
	}
}

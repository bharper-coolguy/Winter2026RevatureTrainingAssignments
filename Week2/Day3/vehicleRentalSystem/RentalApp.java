package com.day3.vehicleRentalSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class RentalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		System.out.print("Enter number of vehicles: ");
		int numVehicles = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < numVehicles; i++) {
			boolean correctInput = false;
			Vehicle rental = null;
			// Get the type of vehicle
			int type = -1;
			while(!correctInput) {
				System.out.print("Enter type (1-Car, 2-Bike): ");
				type = scan.nextInt();
				scan.nextLine();
				if (type == 1) {
					correctInput = true;
				} else if (type == 2) {
					correctInput = true;
				} else {
					System.out.println("Please enter only 1 or 2.");
				}
			}
			
			System.out.print("Enter Vehicle Number: ");
			String vehicleNum = scan.nextLine();
			
			System.out.print("Enter Model: ");
			String model = scan.nextLine();
			
			System.out.print("Enter Rate Per Day: ");
			double ratePerDay = scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Enter Days: ");
			int days = scan.nextInt();
			
			// Polymorphism is used below to assign specific sub-classes to
			// elements of the vehicle array.
			if (type == 1) {
				System.out.print("Enter Insurance per Day: ");
				double insuranceCharge = scan.nextDouble();
				rental = new Car(vehicleNum, model, ratePerDay, days, insuranceCharge);
			} else {
				rental = new Bike(vehicleNum, model, ratePerDay, days);
			}
			vehicles.add(rental);
		}
		System.out.println("--- Rental Details ---");
		double totalRent = 0;
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
			totalRent += vehicle.calculateRent();
		}
		System.out.println("Total Rent Collected: " + totalRent);
		
		scan.close();
	}

}

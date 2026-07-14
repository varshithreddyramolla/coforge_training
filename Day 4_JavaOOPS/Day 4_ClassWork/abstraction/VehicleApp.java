package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		/*
		Bike triumph = new Bike();
		triumph.noOfWheels();
		triumph.brandName();
		triumph.noOfEngine();
		*/
		 VehiclePlan vehicle;
		 
		 vehicle = new Bike();
		 vehicle.numberOfWheels();
		 vehicle.brandName();
	     vehicle.numberOfEngine();
	}

}

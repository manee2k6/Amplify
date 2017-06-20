package com.amplify.practise;

public class BMW extends Car{

	public static void main(String[] args) {
		// Use inheritance by extended function properties in this class..
		
		start();
		accelerate();
		applyGear();
		steering();
		stop();

	}
	
	public static void start(){
		System.out.println("AutoStart of the car using remote");
	}
	
	public static void remoteLock(){
		System.out.println("Remote lock to car..");
	}
	

}

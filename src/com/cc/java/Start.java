package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
	HoneyBee queen = new Queen();
	HoneyBee worker = new Worker();
	HoneyBee drone = new Drone();
	
	ausgabe(queen.fly());
	ausgabe(worker.fly());
	ausgabe(drone.fly());
	
	ausgabe("--------------------");

	ausgabe(queen.doYourJob());
	ausgabe(worker.doYourJob());
	ausgabe(drone.doYourJob());
	
	
	// .. das sollte eigentlich nicht möglich sein!!
	HoneyBee bee = new HoneyBee();
	ausgabe(bee.doYourJob());
	
	
	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}

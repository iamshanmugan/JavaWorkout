package com.java.basics;

import java.util.concurrent.CopyOnWriteArraySet;

public class TestEnum {
	Actors a;

	public TestEnum(Actors actor) {
		this.a = actor;
	}

	

	private void act() {
		System.out.println("Semma action....");
		
	}
	
	public static void main(String[] args) {

		TestEnum te = new TestEnum(Actors.VIJAY);
		te.act();
		
		// gEtting all the enum values
//		Actors[] actArr = Actors.values();
//		for (Actors actors : actArr) {
//			System.out.println(actors+"  -----------Ordinal value which is index of enum--> "+actors.ordinal());
//		}
		
		
		
		// This enum test is to test the object speicific value to access:
		Cars[] cc = Cars.values();
		for (Cars cars : cc) {
			System.out.println(cars+"  -----------Ordinal value which is index of enum--> "+cars.price);
		}
		Bike.PULSAR.sound();
		Bike.YAMAHA.sound();
		
	}
	
	

}

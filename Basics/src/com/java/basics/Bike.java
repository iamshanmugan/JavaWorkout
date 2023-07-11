package com.java.basics;

public enum Bike {
	BULLET,SCOOTY,YAMAHA,
	PULSAR{
		public void sound() {
			System.out.println("two stroke sound.....");
		}
	};
	public void sound() {
		System.out.println("normal sound.....");
	}
}

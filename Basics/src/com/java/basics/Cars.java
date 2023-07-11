package com.java.basics;

public enum Cars {
		LEXUS(90),HONDA(50),HYNDAI(30),BENZ(60), TOYOTA,FORD;
		int price;
		Cars(int i) {
			this.price=i;
		}
		Cars() {
			this.price=0;
		}
		// can use  a normal method from teh enum.
		public static void tes() {
			System.out.println("Iam normal method in enum");
		}
		// we can create a main method in enum
		public static void main(String args[]) {
			System.out.println("Iam from enum  and main method");
			tes();
		}
		
		
}

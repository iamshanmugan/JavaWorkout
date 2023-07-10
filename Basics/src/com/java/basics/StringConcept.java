package com.java.basics;

public class StringConcept {

	public static void main(String[] args) {
		//literals
		String s1 = "string";
		String s2 = "string";
		
		//object with new operator
		String s3 = new String(s2);
		
		if(s1 == s2) {
			System.out.println("== operator using literal s1 == s2 true");
		}
		else {
			System.out.println("== operator using literal s1 == s2 false");
		}
		// will compare the actual value 
		if(s1.equals(s2)) {
			System.out.println("equals method using literal  s1.equals(s2) true");
		}
		else {
			System.out.println("equals method using literal s1.equals(s2) false");
		}
		
		// even its same value == operator will compare the string contant pool and heap which is diff it wont compare the actual value.
		if (s2 == s3) {
			System.out.println("== operator using literal and new String object true");
		}
		else {
			System.out.println("== operator using literal and new String object false");
		}

		// equals method will compare the actual value even if its literal or object. so alway use equals method in String.
		if (s2.equals(s3)) {
			System.out.println("equals method using literal and new string object true");
		}
		else {
			System.out.println("equals method using literal and new string object false");
		}
		
		
	}

}

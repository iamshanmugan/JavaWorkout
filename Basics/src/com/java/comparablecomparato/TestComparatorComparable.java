package com.java.comparablecomparato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorComparable {

	public static void main(String[] args) {
		//comparable sample
		List<Laptop> lstLap = new ArrayList<>();
		lstLap.add(new Laptop("DELL", 2, 14000));
		lstLap.add(new Laptop("HP", 4, 16000));
		lstLap.add(new Laptop("MAC", 1, 17000));
		
		Collections.sort(lstLap);
		
		for(Laptop l: lstLap) {
			System.out.println(l);
		}
		
		//Comparator sample
		List<Laptop2> lstLap2 = new ArrayList<>();
		lstLap2.add(new Laptop2("DELL", 2, 14000));
		lstLap2.add(new Laptop2("HP", 4, 16000));
		lstLap2.add(new Laptop2("MAC", 1, 17000));
		
		Comparator<Laptop2> com = new Comparator<Laptop2>() {
			
			@Override
			public int compare(Laptop2 o1, Laptop2 o2) {
				// TODO Auto-generated method stub
				if(o1.getRam() >o2.getRam()) {
					return 1;
					
				}
				else {
					return -1;
				}
			}
			
			
		};
		Collections.sort(lstLap2,com);
		
		for(Laptop2 l2: lstLap2) {
			System.out.println("Laptop2: "+l2);
		}

	}

}

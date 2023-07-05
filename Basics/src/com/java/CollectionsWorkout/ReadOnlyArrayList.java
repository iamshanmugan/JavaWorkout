package com.java.CollectionsWorkout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Raju");
		nameList.add("Sachu");
		nameList.add("Kani");
		try {
			List<String> readOnlyList =  Collections.unmodifiableList(nameList);
			readOnlyList.add("vino");
		}
		catch(UnsupportedOperationException e) {
				System.out.println(e);
			
		}
		
		

	}

}

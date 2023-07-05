package com.java.basics;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JavaBasics {

	public static void main(String[] args) {
		
		System.out.println("Testing Basics..");
//		//------------------------------------------------------------------
//		// start : 01 : 10 Random number to generate and list in for each
//		Random rndNum = new Random();
//		rndNum.ints().limit(10).forEach(System.out::println);
//		// end : 01 : Random number to generate and list in for each
//	    //------------------------------------------------------------------
//		// start : 02 : Get the lowest number from the list
//		List<Integer> numList = Arrays.asList(22,33,11,44,55,66,99,88,77,20,9,100,200);
//		Integer lowestNumFromList = numList.stream().min(Comparator.naturalOrder()).get();
//		System.out.println(lowestNumFromList);
//		// end : 02 : Get the lowest number from the list

//	    //------------------------------------------------------------------
//		// start : 03 : Get the lowest number from the list using summary statistics
//		List<Integer> numList = Arrays.asList(22,33,11,44,55,66,99,88,77,20,9,100,200);
//		IntSummaryStatistics istat = numList.stream().mapToInt(x -> x).summaryStatistics();
//		System.out.println("Count "+istat.getCount());
//		System.out.println("Max "+istat.getMax());
//		System.out.println("Min "+istat.getMin());
//		System.out.println("Sum "+istat.getSum());
//		System.out.println("Avg "+istat.getAverage());
//		// end : 03 : Get the lowest number from the list using summary statistics
//		//------------------------------------------------------------------
//		// start : 04 : Get Second Friday of next month
//		LocalDate datenow = LocalDate.now().plusMonths(1).plusDays(14);
//		LocalDate secondFridayOfNextMonth = datenow.with(TemporalAdjusters
//				.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
//		System.out.println(secondFridayOfNextMonth);
//		// end : 04 : Get Second Friday of next month
//	    //------------------------------------------------------------------	
//		//------------------------------------------------------------------
//		// start : 05 : Reverse a String
//		String strStraight = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
//		String revString = Arrays.stream(strStraight.split(" "))
//				.map(x -> new StringBuilder(x).reverse())
//				.collect(Collectors.joining(" "));
//		System.out.println(revString);
//		// end : 05 : Reverse a String
//	    //------------------------------------------------------------------
//		//------------------------------------------------------------------
//		// start : 06 : 10 Random number to generate and list in for each
//		Random rndNum = new Random();
//		rndNum.ints().limit(10).forEach(System.out::println);
//		// end : 06 : Random number to generate and list in for each
//	    //------------------------------------------------------------------

	}

}

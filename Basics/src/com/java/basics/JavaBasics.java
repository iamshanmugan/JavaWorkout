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
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
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
//		// start : 06 : using filter and optionalDouble
//		
//		Integer[] intList = new Integer[] {2,3,4,5,6,7,8,9,10,20,40, 50, 60}; 
//		List<Integer> intListcnv =  Arrays.asList(intList);
//		OptionalDouble value = intListcnv.stream().mapToInt(x -> x * x)
//				.filter(x -> x > 100).average();
//		if (value.isPresent()) {
//			System.out.println(value);
//		}
//		// end : 06 : using filter and optionalDouble
//	    //------------------------------------------------------------------
//		// start : 07 : calculate the fibonic number for the index given
//		int numofFibonciIndex =20;
//		int givennum=5;
//		int num1=0;
//		int num2 = 1;
//		int counter=0;
//		while (counter <=numofFibonciIndex) {
//			
//			int num3 = num1 + num2;
//			num1=num2;
//			num2 =num3;
//			counter++;
//			if(givennum == counter ) {
//				System.out.println(num3);
//			}
//			
//			
//		}
//		// end : 07 : calculate the fibonic number for the index given
//		//------------------------------------------------------------------
//		// start : 08 : Get the second largest number from the arraylist
//		int[] listOfNum = {10,20,30,40,50,60,70};
//		int secLargest = Arrays.stream(listOfNum).boxed()
//				.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(secLargest);
//		// end : 08 : Get the second largest number from the arraylist
//	    //------------------------------------------------------------------
//		// start : 09 : Remove duplicates from the arraylist
//		Integer [] dupList = new Integer[]{4,3,2,9,2,9,5,6,7,8};
//		List<Integer> uniqList = Arrays.asList(dupList);
//		Set<Integer> setNoDup = uniqList.stream().collect(Collectors.toSet());
//		System.out.println(setNoDup);
//		// end : 09 : Remove duplicates from the arraylist
//		//------------------------------------------------------------------
//		// start : 10 : Find out the 2 number which is used to get the sum of given num
//		Integer[] listOfNum = new Integer[]{1,2,3,4,5,6,7,8,9}; 
//		int givenNum= 5;
//		for(int i=0;i<listOfNum.length;i++) {
//			int firstNum=listOfNum[i];
//			for(int j= i+1; j<listOfNum.length;j++) {
//				int secondNum=listOfNum[j];
//				if (firstNum + secondNum == givenNum) {
//					System.out.println("FirstNum"+ firstNum+"   Second Num "+ secondNum);
//				}
//			}
//		}
//		// end : 10 :Find out the 2 number which is used to get the sum of given num
//	    //------------------------------------------------------------------
//		// start : 11 : predicate sample
//		Predicate<Integer> eligibleAge = (x) -> x >= 13;
//		System.out.println(eligibleAge.test(13));
//		// end : 11 :  predicate sample
//	    //------------------------------------------------------------------
		
		
	}

}

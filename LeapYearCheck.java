package com.tcc.java.programs;

import java.util.*;

public class LeapYearCheck {
	public static void main(String args[]) {
		int year;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year");
		year = in.nextInt();
		 
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
             System.out.println(year + " is a Leap Year");
        else
             System.out.println(year + " is not a Leap Year");
    }
}
/*
Enter a year
2014
2014 is not a Leap Year

Enter a year
2012
2012 is a Leap Year
*/

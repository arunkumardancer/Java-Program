package com.tcc.java.programs;

import java.util.*;

public class ArrayElementSum {
	public static void main(String args[]) {
		int count, sum = 0, i;
		int[] inputArray = new int[500];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		count = in.nextInt();
		System.out.println("Enter " + count + "elements");
		for(i = 0; i < count; i++) {
			inputArray[i] = in.nextInt();
		}
		
		for (int num : inputArray) {
			sum = sum + num;
		}
		
		System.out.println("Sum of all elements = " + sum);
	}
}
/*
Enter number of elements
5
Enter 5elements
3 8 1 7 2
Sum of all elements = 21
*/
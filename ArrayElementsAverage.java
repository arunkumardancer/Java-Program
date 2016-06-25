package com.tcc.java.programs;

import java.util.*;

public class ArrayElementsAverage {
	public static void main(String args[]) {
		int count, sum, i;
		int[] inputArray = new int[500];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		count = in.nextInt();
		System.out.println("Enter " + count + " elements");
		for(sum = 0, i = 0; i < count; i++) {
			inputArray[i] = in.nextInt();
			sum = sum + inputArray[i];
		}
        
        System.out.println("Average : " + (double)sum/count);
	}
}
/*
Enter number of elements
5
Enter 5 elements
5 5 5 5 5
Average : 5.0

Enter number of elements
6
Enter 6 elements
1 2 3 4 5 6
Average : 3.5
*/
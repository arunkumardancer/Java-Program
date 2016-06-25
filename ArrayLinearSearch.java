package com.tcc.java.programs;

import java.util.*;

public class ArrayLinearSearch {
	public static void main(String args[]) {
		int count, num, i;
		int[] inputArray = new int[500];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		count = in.nextInt();
		System.out.println("Enter " + count + " elements");
		for(i = 0; i < count; i++) {
			inputArray[i] = in.nextInt();
		}
		System.out.println("Enter element to search");
		num = in.nextInt();
		// Compare each element of array with num
		for (i = 0; i < count ; i++) {
			if(num == inputArray[i]){
				System.out.println(num + " is present at index " +  i);
				break;
			}
		}
		
		if(i == count)
		    System.out.println(num + " not present in input array");
	}
}
/*
Enter number of elements
6
Enter 6 elements
3 8 7 2 9 4
Enter element to search
7
7 is present at index 2

Enter number of elements
7
Enter 7 elements
3 8 12 8 11 0 -4
Enter element to search
5
5 not present in input array
*/
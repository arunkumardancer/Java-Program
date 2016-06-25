package com.tcc.java.programs;

import java.util.*;

public class MultiplicationTableTrianglePattern {
	public static void main(String args[]) {
		int rows, i, j;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows in pattern");
		rows = in.nextInt();

		for (i = 0; i < rows; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(i*j + " ");
			}
			System.out.print("\n");
		}

	}
}
/*
Enter number of rows in pattern
6
0 
0 1 
0 2 4 
0 3 6 9 
0 4 8 12 16 
0 5 10 15 20 25 

*/
package com.tcc.java.programs;

import java.util.*;

public class BinaryToDecimal {
	public static void main(String args[]) {
		String binary;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Binary Number");
		binary = in.nextLine();
		
		System.out.println("Decimal Number : "+Integer.parseInt(binary,2));

	}
}
/*
Enter a Binary Number
1001
Decimal Number : 9
*/
package com.tcc.java.programs;

import java.util.*;

public class OddOrEvenOne {
	public static void main(String args[]) {
		int num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Integer");
		num = in.nextInt();

		if (num%2 == 0)
			System.out.println(num + " is a EVEN Number");
		else
			System.out.println(num + " is ODD Number");
	}
}
/*
Enter an Integer
4
4 is a EVEN Number

Enter an Integer
5
5 is ODD Number
 */
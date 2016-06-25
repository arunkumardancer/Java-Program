package com.tcc.java.programs;

import java.util.*;

public class BinaryToDecimalTwo {
	public static void main(String args[]) {
		int num, decimal = 0, i=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Binary Number");
		String binary = in.nextLine();
		num = Integer.parseInt(binary);
        
		while(num != 0){
			decimal += (num%10)*Math.pow(2, i);
			num = num /10;
			i++;
		}
		
		System.out.println("Decimal Number : "+ decimal);

	}
}
/*
Enter a Binary Number
100
Decimal Number : 4

Enter a Binary Number
10101
Decimal Number : 21
*/
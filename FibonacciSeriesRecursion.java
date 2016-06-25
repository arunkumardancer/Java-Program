package com.tcc.java.programs;

import java.util.*;

public class FibonacciSeriesRecursion {
	public static void main(String args[]) {
		int terms, i;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of terms in Fibonacci Series");
		terms = in.nextInt();

        /*
         *  fibonacci(N) = fibonacci(N - 1) + fibonacci(N - 2);
         */
	    for(i = 0; i < terms; i++){
	    	System.out.print(fibonacci(i) + " ");
	    }
	}
	
	public static int fibonacci(int num){
	    /* Exit condition of recursion*/
	    if(num < 2)
	       return num;
	    return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
/*
Enter number of terms in Fibonacci Series
12
0 1 1 2 3 5 8 13 21 34 55 89 
*/
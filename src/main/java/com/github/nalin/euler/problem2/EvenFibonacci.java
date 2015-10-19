package com.github.nalin.euler.problem2;

import java.util.ArrayList;

public class EvenFibonacci {

	public static void main(String[] args) {

		EvenFibonacci fib = new EvenFibonacci();
		fib.sumOfEvenFibonacci(4000000);

	}
	
	public int sumOfEvenFibonacci(int upperLimit) {
		
		ArrayList<Integer> fibs = new ArrayList<>();
		int curr = 2;
		int sum = 0;
		int prev = 1;
		int temp = 0;
		
		fibs.add(prev);
				
		while ( curr < upperLimit) {		
		
			fibs.add(curr);
			if( curr % 2 ==0)
				sum = sum + curr;
			
			temp = curr;
			curr = curr+ prev;
			prev = temp;			
			
		}
		System.out.println("The fibonacci numbers = " + fibs);
		System.out.println(" Sum of even numbers = " + sum);
		return sum;
	}
	
	
	

}

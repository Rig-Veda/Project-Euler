package com.github.nalin.euler.problem1;

/**
 * The first problem of Project Euler
 * 
 * @author nalink
 *
 */
public class Multiples {

	public static void main(String[] args) {
		int number = 1000;
		
		Multiples m = new Multiples();
		
		System.out.println(m.sumOfMultiples(number));

	}
	
	private int sumOfMultiples( int j ) {
		
		int sum = 0;
		
		for(int i=0; i<j; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum = sum + i;
		}
		
		return sum;
	}

}

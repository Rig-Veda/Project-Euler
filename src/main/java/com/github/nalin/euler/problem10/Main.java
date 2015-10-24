package com.github.nalin.euler.problem10;

import java.util.List;

import com.github.nalin.euler.problem7.PrimeNumberGenerator;
import com.github.nalin.euler.problem7.SimplePrimeNumber;

public class Main {

	public static void main(String[] args) {
		
		PrimeNumberGenerator gen = new SimplePrimeNumber();
		
		List<Integer> primes = gen.getPrimes(2000000);
		long sum =0;
		
		for (Integer integer : primes) {
			sum = sum + integer;
		}

		System.out.println("The sum is " + sum);
	}

}

package com.github.nalin.euler.problem7;

import java.util.ArrayList;
import java.util.List;

public class SimplePrimeNumber implements PrimeNumberGenerator {

	@Override
	public long getNthPrime(int n) {

		int primeCount = 0;
		int i = 0;

		while (primeCount < n) {
			i++;
			if (isPrime(i)) {
				primeCount++;
			}

		}

		return i;
	}

	private boolean isPrime(int number) {

		if (number < 2) {
			return false;
		}

		int ceil = (int) Math.sqrt(number);

		for (int i = 2; i <= ceil; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	@Override
	public List<Integer> getPrimes(int limit) {
		
		List<Integer> primes = new ArrayList<>();
		
		for(int i=2; i < limit; i++) {
			
			if(isPrime(i)) {
				primes.add(i);
			}
		
		}
		
		return primes;
	}
}

package com.github.nalin.euler.problem7;

public class StoredPrimeNumber implements PrimeNumberGenerator {

	
	
	@Override
	public long getNthPrime(int n) {
		
		int[] primes = new int[n];
		
		int primeCounter = 0;
		int i = 0;
		
		while (primeCounter < n) {
			
			i++;
			
			if(isPrime(i, primes, primeCounter)) {
				
				primes[primeCounter] = i;
				primeCounter++;				
			}
		}
		
		return i;
	}

	private boolean isPrime(int number, int[] primes, int primesLength) {

		if (number < 2) {
			return false;
		}
		
		int c = (int) Math.sqrt(number);
		
		for (int i = 0; i < primesLength; i++) {
			if ( (primes[i] <= c) && (number % primes[i] == 0)) {
				return false;
			}
		}

		return true;
	}
	
}

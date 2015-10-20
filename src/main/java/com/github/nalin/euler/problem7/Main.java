package com.github.nalin.euler.problem7;

/**
 * 
 * Main class to test primes
 * 
 * @author Nalin
 *
 */
public class Main {

	public static void main(String[] args) {

		int NUM_PRIME = 10001;

		PrimeNumberGenerator primeGen;
		long time;
		long num;
		
		for(int i = 0; i<3 ; i++) {
			
			primeGen = new SimplePrimeNumber();

			time = System.currentTimeMillis();
			num = primeGen.getNthPrime(NUM_PRIME);
			System.out.println("The " + NUM_PRIME + "st prime number is " + num + ".  Found in "
					+ (System.currentTimeMillis() - time) + " millis using SimplePrimeNumber");

			
			primeGen = new StoredPrimeNumber();

			time = System.currentTimeMillis();
			num = primeGen.getNthPrime(NUM_PRIME);
			System.out.println("The " + NUM_PRIME + "st prime number is " + num + ".  Found in "
					+ (System.currentTimeMillis() - time) + " millis using StoredPrimeNumber");
			
		}
		
		
	}

}

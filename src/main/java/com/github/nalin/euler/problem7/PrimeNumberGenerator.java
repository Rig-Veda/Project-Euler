package com.github.nalin.euler.problem7;

import java.util.List;

public interface PrimeNumberGenerator {

	public long getNthPrime(int n);
	
	public List<Integer> getPrimes(int limit);
	
}

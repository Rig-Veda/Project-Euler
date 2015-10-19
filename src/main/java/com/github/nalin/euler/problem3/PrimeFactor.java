package com.github.nalin.euler.problem3;

public class PrimeFactor {

	public static void main(String[] args) {
		
		PrimeFactor pf = new PrimeFactor();
		System.out.println(pf.largestPrimeFactor(600851475143L));	

	}
	
	public long largestPrimeFactor(long n) {

        // largest composite factor must be smaller than sqrt
        long sqrt = (long)Math.ceil(Math.sqrt((double)n));

        long largest = -1;

        for(long i = 2; i <= sqrt; i++) {
            if(n % i == 0) {
                long test = largestPrimeFactor(n/i);
                if(test > largest) {
                    largest = test;
                }
            }
        }

        if(largest != -1) {
            return largest;
        }

        // number is prime
        return n;
    } 

}

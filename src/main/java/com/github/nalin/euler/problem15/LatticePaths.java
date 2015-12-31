package com.github.nalin.euler.problem15;

import java.math.BigInteger;

public class LatticePaths {

	public static void main(String[] args) {
		
		
		LatticePaths path = new LatticePaths();		
		
		BigInteger r = path.factorial(40).divide((path.factorial(20).multiply(path.factorial(20))));
		
		System.out.println(r);

	}
	
	private BigInteger factorial(long n) {
		
		BigInteger val = new BigInteger(""+n);
		
		for(long i= n-1 ;i>=1; i--) {
			val = val.multiply(new BigInteger(""+i));
		}
		
		return val;
	}

}

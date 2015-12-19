package com.github.nalin.euler.problem16;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		int pow = 1000;
		
		BigInteger val = new BigInteger("2").pow(pow);		
		
		System.out.println( " one = " + Math.pow(2, 1000) + "  second = " + val.longValue());
		
		String stringNum = val.toString();
		int sum = 0;
		
		for (int i = 0; i < stringNum.length(); i++) {
			sum += Integer.parseInt(stringNum.substring(i, i+1)); 
		}

		System.out.println(" Sum = " + sum + " , calculated in " + (System.currentTimeMillis() - time) + " ms" );
	}

}

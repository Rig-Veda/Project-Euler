package com.github.nalin.euler.problem12;

public class TriangularNum {

	public static void main(String[] args) {
				
		long time = System.currentTimeMillis();
		for(long i = 1;  ;i++ ) {
			
			long num = sum(i);
			
			long f = getFactors(num);
			
			if(f >= 500) {
				System.out.println(num + "   calculated in " + (System.currentTimeMillis() - time) + " ms");
				break;
			}
			
			
		}

	}
	
	private static long sum(long x) {
		return x * (x+1)/2;
	}
	
	private static long getFactors(long num) {
				
		long len = 0;
		
		long i;
		for( i =1; i*i < num; i++) {
			
			if(num % i == 0) {
				len++;
			}
			
		}
		
		len *= 2;
		if( i * i == num ) {
			++len;
		}
		return len;
	}

}

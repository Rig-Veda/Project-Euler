package com.github.nalin.euler.problem9;

public class PythagoreanTriplet {

	public static void main(String[] args) {	
		
		
		for(int i = 1; i < 1000; i++) {
			
			
			for(int j = 1; j < 1000; j++) {
				
				int k = 1000 - ( i + j);
				
				int ii = i * i;
				int jj = j * j;
				
				int kk = k * k;
				
				if( (ii + jj) == kk) {
					System.out.println(i + "           " + j + "                 "+ k);
					System.out.println(i * j * k);					
				}
				
			}
		}

	}
	
	

}

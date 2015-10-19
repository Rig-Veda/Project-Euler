package com.github.nalin.euler.problem5;

import java.util.Arrays;
import java.util.List;

public class LCM {
	
	public static void main(String... args ) {
		
		
		LCM l = new LCM();

		System.out.println(l.findLCM(Arrays.asList(1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20)));
//		System.out.println(l.finLCM(Arrays.asList(6,3)));
//		System.out.println(l.finLCM(Arrays.asList(9,7)));
		
		
	}

	public int findLCM(List<Integer> values) {
		
		int max = 0;
		
		for (Integer integer : values) {
			max = integer > max ? integer : max;
		}
		
		int lcm = max;
					
		while ( ! isDivisible(lcm, values)) {
			lcm = lcm + max;
		}
		
		return lcm;
	}
	
	private boolean isDivisible(Integer num, List<Integer> val) {
		
		for (Integer integer : val) {
			
			if(num % integer != 0) {
				return false;
			}
			
		}
		
		return true;
	}
}

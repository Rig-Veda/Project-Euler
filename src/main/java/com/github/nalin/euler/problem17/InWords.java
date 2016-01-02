package com.github.nalin.euler.problem17;

public class InWords {
	
	
	static String[] palceArr = new String[] { 
			"",			
			"thousand",
			"million"
	};

	public static void main(String[] args) {
		

		String input = "1000";
		
		int len = input.length();
		
		String result = "";
		
		int remaining = len;
		int index = 0;
		
		while (remaining > 0 ) {
			
			String next = null;
			
			if(remaining >= 3) {
				next = input.substring(remaining-3, remaining+1);
			}else {
				next = input.substring(0, remaining+1);
			}
			
			
			result = getNumber(next) + palceArr[index] + result;
		}
		
	}
	
	
	private static String getNumber(String num) {
		
		
		
		return null;
	}

}


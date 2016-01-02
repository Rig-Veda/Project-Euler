package com.github.nalin.euler.problem17;

public class InWords {

	static String GAP = " ";

	static String[] palceArr = new String[] { 
			"", 
			"thousand", 
			"million" };

	static String[][] digits = new String[][] { 
			{ "",		 "Ten",			 "" },
			{ "One",	 "Eleven",		 "" }, 
			{ "Two",	 "Twelve",		 "Twenty" },
			{ "Three",	 "Thirteen",	 "Thirty" }, 
			{ "Four",	 "Fourteen",	 "Forty" }, 
			{ "Five",	 "Fifteen",		 "Fifty" },
			{ "Six",	 "Sixteen",		 "Sixty" }, 
			{ "Seven",	 "Seventeen",	 "Seventy" }, 
			{ "Eight",	 "Eighteen",	 "Eighty" },
			{ "Nine",	 "Nineteen",	 "Ninety" }, 
			{ "Ten",	 "Twenty",		 "" } 
		};

	public static void main(String[] args) {

		int input = 1000;
		int length = 0;
		
		for(int i = 1; i <= input; i++  ) {
			length = length + getInWords(i+"").replaceAll(" ", "").trim().length();
//			System.out.println(getInWords(i+"").replaceAll(" ", "").trim());
		}

		System.out.println(length);
	}

	public static String getInWords(String num) {

		int len = num.length();

		String result = "";

		int remaining = len;
		int index = 0;

		while (remaining > 0) {

			String next = null;

			if (remaining >= 3) {
				next = num.substring(remaining - 3, remaining);
			} else {
				next = num.substring(0, remaining);
			}

			result = getNumber(next, index == 0 && len > 3) + GAP + palceArr[index] + GAP + result;
			remaining = remaining - 3;
			index++;
		}

		return result;
	}

	public static String getNumber(String num, boolean andFlag) {

		if (num.length() != 3) {
			num = String.format("%03d", Integer.parseInt(num));
		}
		

		String result = "";

		String h = num.substring(0, 1);
		int hNum = Integer.valueOf(h);

		if (hNum > 0) {
			result = digits[hNum][0] + GAP + "Hundred";
		}

		
		if( (andFlag || hNum > 0) && Integer.valueOf(num.substring(1, 3)) > 0) {
			result = result + GAP + "and";
		}
		
		h = num.substring(1, 2);
		hNum = Integer.valueOf(h);		

		if (hNum == 1) {
			result = result + GAP + digits[Integer.valueOf(num.substring(2, 3))][1];
			
			return result;
			
		} else if (hNum > 0) {
			result = result + GAP + digits[hNum][2];
		}

		h = num.substring(2, 3);
		hNum = Integer.valueOf(h);

		result = result + GAP + digits[Integer.valueOf(hNum)][0];

		return result;
	}

}

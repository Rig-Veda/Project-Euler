package com.github.nalin.euler.problem14;

public class CollatzSequence {

	public static void main(String[] args) {

		long time = System.nanoTime();

		long maxNum = 1000000;
		long maxCnt = 0;
		long maxCollatzNum = 0;

		for (long i = maxNum; i >= 2; i--) {

			long tmp = i;
			long cnt = 0;

			while (tmp != 1) {
				cnt++;
				tmp = (tmp % 2 == 0 ? tmp / 2 : 3 * tmp + 1);
				if(tmp < 0) {
					System.out.println(" data type overflow");
				}
			}

			if (cnt > maxCnt) {
				maxCnt = cnt;
				maxCollatzNum = i;
			}

		}

		System.out.println("Tha max depth of collatz sequnce is for number " + maxCollatzNum);
		System.out.println(" Found in time = " + (System.nanoTime() - time));

	}

}

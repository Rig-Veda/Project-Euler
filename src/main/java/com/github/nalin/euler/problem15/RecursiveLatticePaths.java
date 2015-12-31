package com.github.nalin.euler.problem15;

import java.util.HashMap;
import java.util.Map;

public class RecursiveLatticePaths {

	private Map<String, Long> cache = new HashMap<>();

	public static void main(String[] args) {

		long time = System.currentTimeMillis();

		System.out.println(" The number of paths is " + new RecursiveLatticePaths().countPath(20, 20)
				+ " and time taken is" + (System.currentTimeMillis() - time));
	}

	private long countPath(int x, int y) {

		if (x == 0 || y == 0) {
			return 1;
		} else if (cache.get(x + ":" + y) != null) {
			return cache.get(x + ":" + y);
		} else {
			cache.put(x + ":" + y, countPath(x - 1, y) + countPath(x, y - 1));
			return cache.get(x + ":" + y);
		}
	}

}

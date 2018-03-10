package com.codility.solutions;

/**
 * Problem Source:
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */

class PassingCars {

	public static void main(String[] args) {
		PassingCars passingCars = new PassingCars();

		int[] cars = { 0, 1, 0, 1, 1 };
		int solution = passingCars.solution(cars);

		System.out.println(solution);
	}

	/**
	 * Credit Goes To dominik-sze 
	 * https://github.com/dominik-sze/Codility
	 */
	public int solution(int[] A) {
		int eastCars = 0;
		int passed = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				eastCars++;
			} else {
				passed += eastCars;
				if (passed > 1000000000) {
					return -1;
				}
			}
		}
		return passed;
	}

	/**
	 * https://github.com/ZRonchy/Codility/blob/master/Lesson3/PassingCars.java
	 */

	public int solution2(int[] A) {
		// write your code in Java SE 8
		int countOne = 0;
		int countZero = 0;
		int pair = 0;
		int counter = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			counter++;
			if (A[i] == 1) {
				countOne++;
			} else if (A[i] == 0) {
				countZero++;
				pair += counter - countZero;
				if (pair > 1000000000) {
					return -1;
				}
			}
		}
		return pair;
	}
}

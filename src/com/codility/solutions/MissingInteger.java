package com.codility.solutions;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */

class MissingInteger {
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
    public int solution(int[] A) {
        int tmp;
        int[] sorted = new int[A.length];
        for(int i=0; i<A.length; i++) {
            if(A[i]<1) {
                continue;
            } else if(A[i]>A.length) {
                continue;
            } else {
                sorted[A[i]-1] = A[i];
            }
        }
        for(int i=0; i<sorted.length; i++) {
            if(sorted[i]!=i+1) {
                return i+1;
            }
        }       
        return A.length+1;
    }
}

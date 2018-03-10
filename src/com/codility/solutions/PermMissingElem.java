package com.codility.solutions;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */

class PermMissingElem {
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	
    public int solution(int[] A) {
        long N = A.length+1;
        long sum = (N*(N+1))/2;
        for(int i=0; i<A.length; i++) {
            sum-=(long)A[i];
        }
        return (int)(sum);
    }
}

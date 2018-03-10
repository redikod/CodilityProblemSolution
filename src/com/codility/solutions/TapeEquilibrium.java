package com.codility.solutions;

import java.math.*;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */

class TapeEquilibrium {
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	
    public int solution(int[] A) {
        int leftSum = 0;
        int rightSum = 0;
        int diff;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            leftSum+=A[i];
        }
        for(int i=A.length-1; i>0; i--) {
            rightSum+=A[i];
            leftSum-=A[i];
            diff = (int)Math.abs(leftSum-rightSum);
            if(diff<minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}

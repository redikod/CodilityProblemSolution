package com.codility.solutions;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */

class FrogRiverOne 
{
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	
    public int solution(int X, int[] A) {
        int[] s = new int[X+1];
        int jumps = X;
        for(int i=0; i<A.length; i++) {
            if((A[i]-1)<s.length) {
                s[A[i]-1]++;
                if(s[A[i]-1]==1) {
                    jumps--;
                }
            }
            if(jumps==0) {
                return i;
            }
        }
        return -1;
    }
}


package com.codility.solutions;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */

import java.math.*;

class FrogJmp {
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil(((double)(Y-X))/D);
    }
}

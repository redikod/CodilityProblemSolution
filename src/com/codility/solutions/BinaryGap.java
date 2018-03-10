package com.codility.solutions;

/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */

class BinaryGap {

	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') {
            i--;
        }
        int gap = 0;
        int counter = 0;
        for(; i>=0; i--) {
            if(binary.charAt(i)=='1') {
                gap = Math.max(gap, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        gap = Math.max(gap, counter);
        return gap;
    }
}

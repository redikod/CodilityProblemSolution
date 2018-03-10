package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

import java.lang.Math.*;

class MaxSliceSum {
    public int solution(int[] A) {
        int maxEnd = A[0];
        int maxSlice = A[0];
        for(int i=1; i<A.length; i++) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            maxSlice = Math.max(maxSlice, maxEnd);
        }
        return maxSlice;
    }
}

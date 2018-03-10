package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

import java.util.*;

class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        long x,y,z;
        for(int i=0; i<A.length-2; i++) {
            x=A[i]; y=A[i+1]; z=A[i+2];
            if(x+y>z && x+z>y && y+z>x) {
                return 1;
            }
        }
        return 0;
    }
}

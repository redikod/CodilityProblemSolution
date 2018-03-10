package com.codility.dominiksze;

import java.util.*;

class Distinct {
    public int solution(int[] A) {
        Set<Integer> unique = new HashSet<Integer>();
        for(int i=0; i<A.length; i++) {
            unique.add(A[i]);
        }
        return unique.size();
    }
}


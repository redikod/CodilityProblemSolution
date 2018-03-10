package com.codility.dominiksze;

import java.lang.Math.*;

class CountDiv {
    public int solution(int A, int B, int K) {
        return (int)Math.floor((double)(B-A)/(double)K) + (B%K < A%K || A%K==0 ? 1 : 0);
    }
}

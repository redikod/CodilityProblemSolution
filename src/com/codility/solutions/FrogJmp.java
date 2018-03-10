package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

import java.math.*;

class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil(((double)(Y-X))/D);
    }
}

package com.codility.dominiksze;

import java.math.*;

class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil(((double)(Y-X))/D);
    }
}

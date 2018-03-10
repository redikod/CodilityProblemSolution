package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

class CountFactors {
    public int solution(int N) {
        int counter = 0;
        for(int i=1; i<=(int)Math.sqrt(N); i++) {
            if(N%i==0 && i*i!=N) {
                counter+=2;
            } else if (i*i==N) {
                counter++;
            }
        }
        return counter;
    }
}

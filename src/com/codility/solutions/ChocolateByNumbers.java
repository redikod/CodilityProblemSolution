package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

class ChocolateByNumbers {
    public int solution(int N, int M) {
        return N/gcd(N, M);
    }
    
    public int gcd(int a, int b) {
        if(a%b==0) {
            return b;
        } else {
            return gcd(b, a%b);
        }
    }
}

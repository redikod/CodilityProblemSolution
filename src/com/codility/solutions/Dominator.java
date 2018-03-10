package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

class Dominator {
    public int solution(int[] A) {
        int size = 0;
        int value = 0;
        for (int i=0; i<A.length; i++) {
            if (size==0) {
               size++;
               value=A[i];
            } else if (size!=0) {
                if (value!=A[i]) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        int candidate = -1;
        if (size != 0) {
            candidate = value;
        }
        int count = 0;
        int index = -1;
        int cindex = -1;
        for(int i=0; i<A.length; i++) {
            if (candidate==A[i]) {
                count++;
                cindex = i;
            }
        }
        if (count>A.length/2) {
            index = cindex;
        }
        return index;
    }
}


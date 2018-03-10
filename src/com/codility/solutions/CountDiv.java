package com.codility.solutions;


import java.lang.Math.*;

class CountDiv {
    
	public static void main(String[] args) {
		System.out.println("solution " + solution2(6, 11, 2));
	}
	
	/**
	 * Credit Goes To dominik-sze
	 * https://github.com/dominik-sze/Codility
	 */
	public static int solution(int A, int B, int K) {
        return (int)Math.floor((double)(B-A)/(double)K) + (B%K < A%K || A%K==0 ? 1 : 0);
    }

	/**
	 * https://github.com/karimhamdanali/codility/blob/master/src/codility/CountDiv.java
	 * @author karim
	 * Time: O(1)
	 * Space: O(1)
	 */
 	public static int solution2(int A, int B, int K) {
         // write your code in Java SE 8
 		return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
     }

	/**
	 * https://github.com/hyogij/Algorithm/blob/master/codility/Lesson3.CountDiv/src/codility/CountDiv.java
	 * Author : Hyogi Jung(hyogij@gmail.com)
	 */
 	public static int solution3(int A, int B, int K) 
 	{
		if(B < K) 
		{
			return 0;
		}
		int num1 = A / K;
		
		if(A % K != 0) 
		{
			num1++;
		}
		int num2 = B / K;
		return num2 - num1 + 1;
	}
}

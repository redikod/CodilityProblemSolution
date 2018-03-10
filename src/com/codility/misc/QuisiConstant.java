package com.codility.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class QuisiConstant {
	
	// Testing program
    public static void main(String args[])
    {
    	QuisiConstant obj = new QuisiConstant();
        int arr[] =  {6, 10, 6, 9, 7, 8};
        int n = arr.length;
        int longestCons = obj.solution(arr);
        System.out.println("Length of the Longest consecutive subsequence is " + longestCons);
    }
    
    //https://bluebottle.idv.tw/?p=9287
  
    public int solution(int[] A) {
    	// write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int i:A)
            map.compute(i, (k,v) -> v == null ? 1 : v+1);
            
        for(Entry<Integer, Integer> e : map.entrySet()) 
        {
            int t = e.getValue() + map.getOrDefault(e.getKey() + 1, 0);
            if(t > max) 
            	max = t;
        }
        return max;
    }
    
	// Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[],int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
 
        // Hash all the array elements
        for (int i=0; i<n; ++i)
            S.add(arr[i]);
 
        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<n; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i]-1))
            {
                // Then check for next elements in the
                // sequence
                int j = arr[i];
                while (S.contains(j))
                    j++;
 
                // update  optimal length if this length
                // is more
                if (ans<j-arr[i])
                    ans = j-arr[i];
            }
        }
        return ans;
    }
}

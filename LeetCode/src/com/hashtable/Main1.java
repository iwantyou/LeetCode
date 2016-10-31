package com.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 438. Find All Anagrams in a String
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
	Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
	Input:
	s: "cbaebabacd" p: "abc"

	Output:
	[0, 6]

	Explanation:
	The substring with start index = 0 is "cba", which is an anagram of "abc".
	The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 main1=new Main1();
		System.out.println(main1.findAnagrams("cbaebabacd", "abc").toString());
		
	}
	/*
	 * hash+slide window
	 */
	 public List<Integer> findAnagrams(String s, String p) {
		 int lenp=p.length();
		 int lens=s.length();
		 List<Integer> list=new ArrayList<>();
		 int window=lenp;
		 int[] hash1=new int[256];
		 int[] hash2=new int[256];
		 for(int i=0;i<p.length();i++){
			 hash1[p.charAt(i)-'a']++;
		 }
		 int count=0;
		 for(int j=0;j<lens;j++){
			 hash2[s.charAt(j)-'a']++;
			 count++;
			 if(count==window){
				 if(Arrays.equals(hash1, hash2))  list.add(j-window+1);
				 hash2[s.charAt(j-window+1)-'a']--;
				 count--;
			 } 
			 
		 }
		 return list;
	 }

}

package com.hashtable;
/*
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 main4=new Main4();
		System.out.println(main4.lengthOfLongestSubstring("abcabcbb"));
	}
	public int lengthOfLongestSubstring(String s){
		
		int count=0;
		int max=0;
		int []hansh=new int[256];
		for(int i=0;i<s.length();i++){
			
			hansh[s.charAt(i)]++;
			if(hansh[s.charAt(i)]==1){
				count++;
			}else{
				if(max<count){
					max=count;
					
				}
				i-=count;
				count=0;
				int[]hansh1=new int[256];
				hansh=hansh1;
			
				
			}
		}
		if(max<count) max=count;
		return max;
	}

}

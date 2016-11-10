package com.dynamic;
/*
 * https://leetcode.com/problems/edit-distance/
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

	You have the following 3 operations permitted on a word:
	
	a) Insert a character
	b) Delete a character
	c) Replace a character
 */
public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="food";
		String b="money";
		Main12 main12=new Main12();
		System.out.println(main12.minDistance(a, b));
	}
	public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        if(len1==0&&len2>0) return len2;
        if(len1>0&&len2==0) return len1;
        if(len1==0&&len2==0) return 0;
        int[][]f=new int[len2+1][len1+1];
        if(word1.charAt(0)==word2.charAt(0)) f[0][0]=0;
        else f[0][0]=0;
        for(int j=1;j<len1+1;j++){
        	f[0][j]=j;        	
        }
        for(int i=1;i<len2+1;i++){
        	f[i][0]=i;
        }
        for(int i=1;i<len2+1;i++){
        	for(int j=1;j<len1+1;j++){
        		if(word1.charAt(j-1)==word2.charAt(i-1)) f[i][j]=f[i-1][j-1];
        		else{
        			int temp=Math.min(f[i-1][j], f[i][j-1]);
        			f[i][j]=Math.min(temp, f[i-1][j-1])+1;
        		}
        	}
        }
        return f[len2][len1];
    }
}

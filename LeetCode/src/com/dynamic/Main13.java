package com.dynamic;
/*
 * https://leetcode.com/problems/decode-ways/
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	
	Given an encoded message containing digits, determine the total number of ways to decode it.

	For example,
	Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
	
	The number of ways decoding "12" is 2.
 */
public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main13 main13=new Main13();
		String s="100";
		System.out.println(main13.numDecodings(s));
	}
	 public int numDecodings(String s) {
		 int len=s.length();
		 if(len==0) return 0;
		 if(len==1&&s.charAt(0)=='0') return 0;
		 if(len==1) return 1;
		 int[]f=new int[len];
		 
		 if(s.charAt(0)=='0') f[0]=0;
		 else f[0]=1;
		 int temp=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
		 if(s.charAt(1)=='0'){
			 if(temp>26||temp<10) f[1]=0;
			 else f[1]=1;
		 }
		 else{
			 if(temp>26) f[1]=1;
			 else if(temp<10) f[1]=0;
			 else f[1]=2;
		 }
		 for(int i=2;i<len;i++){
			 
			 int pre=s.charAt(i-1)-'0';
			 int num=10*pre+(s.charAt(i)-'0');
			 
			 if(s.charAt(i)=='0'){
				 
				 if(num>26||num<10) f[i]=0;
				 else f[i]=f[i-2];
			 }
			 else{
				 if(num>26||num<10) f[i]=f[i-1];
				 else f[i]=f[i-2]+f[i-1];
			 }
			
		 }
		 return f[len-1];
	}
}

package com.dynamic;
/*
 * https://leetcode.com/problems/is-subsequence/
 * Given a string s and a string t, check if s is subsequence of t.
 * s = "abc", t = "ahbgdc"
	
	Return true.
	
	Example 2:
	s = "axc", t = "ahbgdc"
	Return false.
 */
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main5 main5=new Main5();
		String s="leeeetcode";
		String t = "ylyeyyeyeyeyytycyoydyey";
		System.out.println(main5.isSubsequence(s, t));
	}
	public boolean isSubsequence(String s, String t){
		if(s==null||t==null) return false;
		if(s.length()==0&&t.length()==0) return true;
		if(s.length()!=0&&t.length()==0) return false;
	    if(s.length()==0&&t.length()!=0) return true;
		int len=t.length();
		int s_len=s.length();
		int[]f=new int[len];
		if(s.charAt(0)==t.charAt(0)){
			
			f[0]=1;
		}
		for(int i=1;i<len;i++){
			int match=f[i-1];
			if(match<s_len){
				if(s.charAt(match)==t.charAt(i)) f[i]=f[i-1]+1;
				else f[i]=f[i-1];
			}
			if(match==s_len) return true;
		}
		if(f[len-1]==s_len) return true;
		else return false;
		//这个方法更快，用到了index()这个方法
       /* int prevIndex = -1;
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c, prevIndex + 1);
            if (index == -1) {
                return false;  // not found
            } else {
                prevIndex = index;
            }
        }
        return true;
        */
    
	}
}

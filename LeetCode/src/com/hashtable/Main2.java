package com.hashtable;

import java.math.BigDecimal;
import java.util.Arrays;

/*
 * 409. Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * Input:
	"abccccdd"

	Output:
	7

	Explanation:
	One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class Main2 {

	public static void main(String[] args) {
		Main2 main2=new Main2();
		System.out.println(main2.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

	}
	public int longestPalindrome(String s) {
		/*int count=0;
		int[]hash=new int[256];
		for (int i=0;i<s.length();i++) {
			
			hash[s.charAt(i)-'A']++;
		}
		
		
		for(int i=0;i<hash.length;i++){
			
			if(hash[i]==s.length()) return s.length();
			if(hash[i]%2==0) count+=hash[i];
			else{
				if(hash[i]>1) count+=hash[i]-1;
			}
		}
		
		if(count<s.length()) return count+1;
		return count;
		*/
		int count=0;
		int[]hash=new int[256];
		for (int i=0;i<s.length();i++) {
			
			hash[s.charAt(i)-'A']++;
			if(hash[s.charAt(i)-'A']==2){
				count+=2;
				hash[s.charAt(i)-'A']=0;
			}
		}
		if(count<s.length()) return count+1;
		return count;
    }

}

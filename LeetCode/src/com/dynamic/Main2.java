package com.dynamic;

import java.util.ArrayList;
import java.util.List;

/*
 * 198. House Robber
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 main2=new Main2();
		int[] num={1,1,1};
		System.out.println(main2.rob(num));
	}
	
	public int rob(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int len=nums.length;
		if(len==1) return nums[0];
		if(len==2) return Math.max(nums[0],nums[1]);
		
		
		int[]f=new int[len]; 
		f[0]=nums[0];
		if(nums[0]<nums[1]){
			
			f[1]=nums[1];
		}else{
			f[1]=nums[0];
		}
		for(int i=2;i<len;i++){
			f[i]=Math.max(f[i-1], f[i-2]+nums[i]);
		}
		
        return f[len-1];
    }
}

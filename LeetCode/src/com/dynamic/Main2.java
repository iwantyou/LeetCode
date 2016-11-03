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
	/*
	 * 0:index
	 * 1:money
	 * 		
	 * 
	 */
	public int rob(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int len=nums.length;
		if(len==1) return nums[0];
		if(len==2) return Math.max(nums[0],nums[1]);
		
		int[] in=new int[2];
		List<int[]> f=new ArrayList<>();
		in[0]=0;
		in[1]=nums[0];
		f.add(in);
		int[] in2=new int[2];
		if(nums[0]<nums[1]){
			in2[0]=1;
			in2[1]=nums[1];
		}else{
			in2[0]=0;
			in2[1]=nums[0];
		}
		f.add(in2);
		
		for(int i=2;i<len;i++){
			int[] in3=new int[2];
			int[]n=f.get(i-1);
			int index=n[0];
			int money=n[1];
			if(index!=i-1){
				in3[0]=i;
				in3[1]=money+nums[i];
			}else{
				int p_money=f.get(i-2)[1];
				
				if(p_money+nums[i]>money){
					in3[0]=i;
					in3[1]=p_money+nums[i];
				}else{
					in3[0]=index;
					in3[1]=money;
				}
			}
			f.add(in3);
		}
		
        return f.get(len-1)[1];
    }
}

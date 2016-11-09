package com.dynamic;

import java.util.Arrays;
import java.util.Stack;

/*
 * https://leetcode.com/problems/maximum-subarray/
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

	For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
	the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main9 main9=new Main9();
		int[]nums={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(main9.maxSubArray(nums));
	}
	public int maxSubArray(int[] nums) {
		if(nums==null) return 0;
		int len=nums.length;
		if(len==1) return nums[0];
		int max=Integer.MIN_VALUE;
		int max_index=-1;
		//暴力法，结果正确，但是超时
		/*for(int i=0;i<len;i++){
			int sum=nums[i];
			if(sum>max) max=sum;
			for(int j=i+1;j<len;j++){
				sum+=nums[j];
				if(sum>max) max=sum;
			}
			
			
		}*/
		int[]f=new int[len];
		f[0]=nums[0];
		max=f[0];
		
		
		
		for(int i=1;i<len;i++){
			
			int temp=Math.max(f[i-1]+nums[i], nums[i-1]+nums[i]);
			f[i]=Math.max(temp, nums[i]);
			if(f[i]>max){
				max=f[i];
				max_index=i;
			} 
		}
		//下面可以求出最大和的那个连续数组
		/*int sum=0;
		Stack<Integer>stack=new Stack<>();
		while(sum!=max){
			
			stack.push(nums[max_index]);
			sum+=nums[max_index];
			max_index--;
		}
		int ll=stack.size();
		for (int i = 0; i < ll; i++) {
			System.out.print(stack.pop());
		}
		System.out.println();*/
		return max;
    }
}

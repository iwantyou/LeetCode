package com.dynamic;
/**
 * https://leetcode.com/problems/combination-sum-iv/
 * Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
 * @author wwh
 *nums = [1, 2, 3]
	target = 4
	
	The possible combination ways are:
	(1, 1, 1, 1)
	(1, 1, 2)
	(1, 2, 1)
	(1, 3)
	(2, 1, 1)
	(2, 2)
	(3, 1)
	
	Note that different sequences are counted as different combinations.
	
	Therefore the output is 7.
 */
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main6 main6=new Main6();
		int[]nums={1,2,3};
		int target=4;
		System.out.println(main6.combinationSum4(nums, target));
	}
	public int combinationSum4(int[] nums, int target) {
		int []f=new int[target+1];
		f[0]=0;
		for(int i=1;i<target+1;i++){
			for(int j=0;j<nums.length;j++){
				if(nums[j]<i){
					f[i]+=f[i-nums[j]];			
				} 
				if(nums[j]==i){
					 f[i]+=1;			
				}
			}		
		}
		return f[target];
        
    }
}

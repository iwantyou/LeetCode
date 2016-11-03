package com.dynamic;
/*
 * You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * f(n)：n is all steps of this stari,f(n) is distinct ways to climb to the top.
	 * f(1)=1;
	 * f(2)=2
	 * 状态转移方程：
	 * f(n)=f(n-1)+f(n-2) n>2;
	 * 如果用递归，回有重复计算，所有用动态规划，开辟数组空间。
	 */
	public int climbStairs(int n){
		
		if(n==1) return 1;
		if(n==2) return 2;
		int[] f=new int[n+1];
		f[0]=0;
		f[1]=1;
		f[2]=2;
		for(int i=3;i<n+1;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
		
	}
}

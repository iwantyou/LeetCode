package com.dynamic;
/*
 * https://leetcode.com/problems/unique-paths/
 * 62. Unique Paths
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

	The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

	How many possible unique paths are there?

 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main();
		System.out.println(main.uniquePaths(1, 2));
	}
	/*
	 * 这里是有多少条不同的路径，不是青蛙跳有多少不同的跳法
	 * 
	 */
	public int uniquePaths(int m, int n) {
		int[][]f=new int[m][n];
		f[0][0]=1;
		
		for(int j=1;j<n;j++){
			f[0][j]=1;
		}
		for(int i=1;i<m;i++){
			f[i][0]=1;
		}
		for(int i=1;i<m;i++){ 
			for(int j=1;j<n;j++){
				f[i][j]=f[i-1][j]+f[i][j-1];
			}
		}
		return f[m-1][n-1];
	}
}

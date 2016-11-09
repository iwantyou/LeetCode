package com.dynamic;
/*
 * https://leetcode.com/problems/unique-paths-ii/
 * Follow up for "Unique Paths":

	Now consider if some obstacles are added to the grids. How many unique paths would there be?

	An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 */
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main10 main10=new Main10();
		int[][]obstacleGrid={{0,0,0},
				  			{0,1,0},
				  			{0,0,0}};
		System.out.println(main10.uniquePathsWithObstacles(obstacleGrid));
	}
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]f=new int[m][n];
        if(obstacleGrid[0][0]==1) return 0;
        f[0][0]=1;
        for(int j=1;j<n;j++){
        	if(obstacleGrid[0][j]==1) f[0][j]=0;
        	else{
        		f[0][j]=f[0][j-1];
        	}
        }
        for(int i=1;i<m;i++){
        	if(obstacleGrid[i][0]==1) f[i][0]=0;
        	else{
        		f[i][0]=f[i-1][0];
        	}
        }
        for(int i=1;i<m;i++){ 
			for(int j=1;j<n;j++){
				if(obstacleGrid[i][j]==1) f[i][j]=0;
				else f[i][j]=f[i-1][j]+f[i][j-1];
			}
		}
        return f[m-1][n-1];
    }
}

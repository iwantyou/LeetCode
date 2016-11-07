package com.dynamic;
/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * @author wwh
 *	416. Partition Equal Subset Sum
 *	Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
 */
public class Main4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 main4=new Main4();
		int[]nums={1, 5, 11, 5};
		System.out.println(main4.canPartition(nums));
	}
	//1.��ȱ��������� ����ʱ�� 2.��������
	//���������ά���飬�㷨�����Ĺ��̾��ǲ�ȫ������ά����Ĺ��̡�
    public boolean canPartition(int[] nums) {
        int len=nums.length;
        int sum=0;
        
        for(int i=0;i<len;i++){
            sum+=nums[i];
           
        }
        if(sum%2!=0) return false;
        int weight=sum/2;
        //ǰi����Ʒ�ڷŽ�j����ʱ��������������
        int[][]f=new int[len+1][weight+1];
        int i_len=f.length;
        int j_len=f[0].length;
        for(int j=0;j<j_len;j++){
        	f[0][j]=0;
        }
        for(int i=0;i<i_len;i++){
        	f[i][0]=0;
        }
        //�����Ȳ�ȫ
        for(int i=1;i<i_len;i++){
        	for(int j=nums[i-1];j<j_len;j++){
        		f[i][j]=Math.max(f[i-1][j], f[i-1][j-nums[i-1]]+nums[i-1]);
        	}
        }
      if(f[i_len-1][sum/2]==sum/2) return true;
      else return false;
    }

}

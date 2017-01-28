package com.baidu.leetcode;



/**
 * Created by wangwenhui03 on 17/1/6.
 *  位运算
 *  The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 */
public class code477 {
    public static void  main(String[] args){
        int[] nums={0,14,0,14,0,14};
        code477 cc=new code477();
        System.out.print(cc.totalHammingDistance(nums));
    }
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++) {

            for(int j=i+1;j<nums.length;j++){

                sum+=HammingDistance(nums[i],nums[j]);
            }
        }
        return sum;
    }
    public int HammingDistance(int a,int b){
        int ret = a^b;
        int distance = Integer.bitCount(ret);
        return distance;
    }
}

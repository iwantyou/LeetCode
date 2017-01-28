package com.baidu.leetcode;

import java.util.*;

/**
 * Created by wangwenhui03 on 17/1/17.
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */
public class code39 {
    public static void main(String[]args){
        code39 code=new code39();
        int[]candidates={2,3,6,7};
        int target=7;
        code.combinationSum(candidates,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> inner =new ArrayList<>();
        Arrays.sort(candidates);
        back(list,inner,candidates,target,0);
        System.out.print(list);
        return list;

    }
    public void back(List<List<Integer>> list,List<Integer>inner,int[] number,int target,int deep){
        if(target==0){

            list.add(new ArrayList<>(inner));
        }else{
            for(int i=deep;i<number.length;i++){
                if(number[i]>target) return;
                inner.add(number[i]);
                back(list,inner,number,target-number[i],i);
                inner.remove(inner.size()-1);
            }
        }

    }
}

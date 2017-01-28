package com.baidu.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/16.
 */
public class code47 {
    public static void main(String[] args){
        int[] nums={3,3,0,3};
        code47 code=new code47();
        System.out.print(code.permuteUnique(nums));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        back(list,temp,nums,new boolean[nums.length]);
        return list;
    }
    public void back(List<List<Integer>> list,List<Integer>temp,int[]nums,boolean[]used) {
        if(temp.size() == nums.length){
                list.add(new ArrayList<>(temp));
                return;

        } else{
            for(int i = 0; i < nums.length; i++){

                if(used[i]) continue;
                if((i>0 &&nums[i-1]==nums[i] && !used[i-1])) continue;
                used[i] = true;
                temp.add(nums[i]);
                back(list, temp, nums, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}

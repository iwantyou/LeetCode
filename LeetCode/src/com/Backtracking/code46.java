package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/13.
 */
public class code46 {
    public static void main(String[] args){
        int[] nums={1,2,3};
        code46 code=new code46();
        System.out.print(code.permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inner=new ArrayList<>();
        List<List<Integer>> list =new ArrayList<>();
        back(list,inner,nums);
        return list;
    }


    public void back(List<List<Integer>> list,List<Integer> tempList,int[]nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // element already exists, skip
                //下面这两行是与求子集的区别
                tempList.add(nums[i]);
                back(list, tempList, nums);
                //连续两次删除
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}

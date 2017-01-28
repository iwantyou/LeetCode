package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/12.
 */
public class code78 {
    public static void main(String[] args){
        code78 code=new code78();
        int[]nums={1,2,3};
        code.subsets(nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> inner=new ArrayList<>();
        List<List<Integer>> list =new ArrayList<>();
        list.add(inner);
        Arrays.sort(nums);
        back(list,inner,nums,0);
        System.out.println(list);
        return list;

    }
    public void back(List<List<Integer>> list,List<Integer> inner,int []nums,int deep){

        for(int i=deep;i<nums.length;i++){
            inner.add(nums[i]);//第i个元素选择放入
            back(list,inner,nums,i+1);//寻找下个元素的状态
            list.add(new ArrayList<>(inner));//找到了叶子几点，也就是说确定了一个解
            inner.remove(inner.size()-1);//每个元素有两种状态，或者不放入,这是选择不放入，然后继续深度
        }
    }
}

package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/17.
 */
public class code40 {
    public static void main(String[]args){
        code40 code=new code40();
        int[]candidates={10, 1, 2, 7, 6, 1, 5};
        int target=8;
        code.combinationSum2(candidates,target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> inner =new ArrayList<>();
        Arrays.sort(candidates);
        boolean[]f=new boolean[candidates.length];
        back(list,inner,candidates,target,0,f);
        System.out.print(list);
        return list;

    }
    public void back(List<List<Integer>> list,List<Integer>inner,int[] number,int target,int deep,boolean[]f){
        if(target==0){

            list.add(new ArrayList<>(inner));
        }else{
            for(int i=deep;i<number.length;i++){
                if(number[i]>target) return;
                if(i>0&&number[i]==number[i-1]&&f[i-1]==false){
                    continue;
                }
                f[i]=true;
                inner.add(number[i]);
                back(list,inner,number,target-number[i],i+1,f);
                inner.remove(inner.size()-1);
                f[i]=false;
            }
        }
    }
}

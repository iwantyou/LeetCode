package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/20.
 */
public class code77 {
    public static void main(String[] args){
        int n=4;
        int k=2;
        code77 code=new code77();
        code.combine(n,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        back(list,inner,0,n,k);
        System.out.print(list);
        return list;
    }
    public void back(List<List<Integer>>list,List<Integer> inner,int deep,int n,int k){
        if(inner.size()==k){
            list.add(new ArrayList<>(inner));
        }else{
            for(int i=deep;i<n;i++){
                inner.add(i+1);
                back(list,inner,i+1,n,k);
                inner.remove(inner.size()-1);
            }
        }
    }
}

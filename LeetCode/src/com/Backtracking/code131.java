package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/17.
 */
public class code131 {
    public static void main(String[]args){
        code131 code=new code131();
        String s="aab";
        code.partition(s);
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> inner=new ArrayList<>();
        back(list,inner,s,0);
        System.out.print(list);
        return list;
    }
    public void back(List<List<String>> list,List<String> inner,String s,int deep){
        if(inner.size()>0&&!palindrome(inner.get(inner.size()-1))){
            return;
        }
        if(deep==s.length()) {
            list.add(new ArrayList<>(inner));
        }else{
            for(int i=deep;i<s.length();i++){
                String tmp=s.substring(deep,i+1);
                inner.add(tmp);
                back(list,inner,s,i+1);
                inner.remove(inner.size()-1);

            }
        }
    }
    public boolean palindrome(String s){

        for(int i=0, j=s.length()-1;j-i>=1;i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
}

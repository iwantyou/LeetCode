package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/1/5.
 */
public class code230 {
    /**
     * 二叉搜索数中第k小的元素
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>list = new ArrayList();
        bt(root,list);
        return list.get(k-1);

    }
    public void bt(TreeNode root,List<Integer>list){
        if(root==null) return ;
        else{
            bt(root.left,list);
            list.add(root.val);
            bt(root.right,list);
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}


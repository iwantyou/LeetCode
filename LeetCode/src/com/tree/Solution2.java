package leet;

/**
 * Created by wangwenhui03 on 17/2/18.
Leetcode 105
根据前序和中序遍历 构造出二叉树
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Post{
    int i;
    public Post(int i){
        this.i = i;
    }
}
public class Solution {

    public static void main(String[] args){
      //  int[] inorder={4,2,5,1,6,3};
      //  int[] postorder={4,5,2,6,3,1};
      //  Solution s=new Solution();
      //  TreeNode root = s.buildTree(inorder,postorder);
     //   System.out.println(root.left.left.val);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length==0||preorder.length==0) return null;
        Post post = new Post(0);

        return fun(inorder,preorder,0,inorder.length-1,post);
    }
    //i：头；j:尾
    public TreeNode fun(int[] inorder,int[] preorder,int i,int j,Post post){
        if(i==j) {
            return new TreeNode(inorder[i]);
        }
        else if(j>inorder.length-1||i<0||i>j){
            post.i--;
            return null;
        }
        else{
            TreeNode node = null;
            while (post.i>=0){
//                System.out.println(k);


                node = new TreeNode(preorder[post.i]);

                Integer index = findIndex(inorder,node.val);
                post.i +=1 ;
                node.left=fun(inorder,preorder,i,index-1, post);

                post.i +=1;
                node.right=fun(inorder,preorder,index+1,j,post);
                return node;
               //
            }
            return node;
        }

    }
    public Integer findIndex(int[] inorder,int val){
        for(int i=0;i<inorder.length;i++){
            if(val==inorder[i]) return i;
        }
        return -1;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/2/20.
 */
public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums={-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> list=s.threeSum(nums);
        System.out.println(list.get(0));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        return ksum(nums,3,0,0,list);
    }
    public List<List<Integer>> ksum(int[] nums,int k,int target,int p,List<List<Integer>> list){
        if(k==2){
            for(int i=p,j=nums.length-1;i<j;){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    list.add(inner);
                    while (i+1<nums.length&&nums[i+1]==nums[i]) i++;
                    while (j-1>0&&nums[j-1]==nums[j]) j--;
                    i++;
                    j--;
                }else if(sum<target){
                    i++;
                }else{
                    j--;
                }

            }
            return list;
        }else{
            List<List<Integer>> listAll = new ArrayList<>();
            for(int i=p;i+k<=nums.length;i++){

                list=ksum(nums,k-1,target-nums[i],i+1,new ArrayList<>());
                if(list==null) continue;
                for(List<Integer> l:list){
                    l.add(0,nums[i]);
                }
                listAll.addAll(list);
                while (i+1<nums.length&&nums[i+1]==nums[i]) i++;
            }
            return listAll;
        }

    }
}

import java.util.Arrays;

/**
 * Created by wangwenhui03 on 17/2/21.
 * 3Sum Closest
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i=0;i<nums.length-2;i++){
            int num1=nums[i];
            for(int p=i+1,q=nums.length-1;p<q;){
                int test = num1+nums[p]+nums[q];
                if(test<target){
                    p++;
                }else {
                    q--;
                }
                if(Math.abs(test-target)<Math.abs(result-target)){
                    result = test;
                }
            }
        }
        return result;
    }
}

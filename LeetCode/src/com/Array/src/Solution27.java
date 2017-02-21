/**
 * Created by wangwenhui03 on 17/2/21.
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) continue;
            nums[++end]=nums[i];
        }
        return end+1;
    }
}

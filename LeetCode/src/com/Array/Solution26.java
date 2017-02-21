/**
 * Created by wangwenhui03 on 17/2/21.
 * Remove Duplicates from Sorted Array
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        //有序数组，定义两个指针，i遍历整个数组，end指向有当前不重复数组的尾
        int end = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[end]==nums[i]) continue;
            nums[++end]=nums[i];
        }
        return end+1;
    }
}

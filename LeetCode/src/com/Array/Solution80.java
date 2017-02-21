/**
 * Created by wangwenhui03 on 17/2/21.
 */
public class Solution80 {
    public static void main(String[] args){
        Solution80 s = new Solution80();
        int[] nums={1,1,1,2,2,3};
        s.removeDuplicates(nums);
        System.out.println(nums[4]);
    }
    public int removeDuplicates(int[] nums) {
        //有序数组，定义两个指针，i遍历整个数组，end指向有当前不重复数组的尾
        int end = 1;
        for(int i=2;i<nums.length;i++){
            if(nums[end]==nums[i]&&nums[i]==nums[end-1]) continue;
            nums[++end]=nums[i];
        }
        return end+1;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenhui03 on 17/2/22.
 * Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]

 */
public class Solution448 {
    public static void main(String[] args){
        Solution448 s = new Solution448();
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> list=s.findDisappearedNumbers(nums);
        System.out.println(list.get(1));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        //好傻啊，没有必要一定是-1,为了不丢失原来的值，可以使它变为原来的值。
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}

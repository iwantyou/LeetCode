/**
 * Created by wangwenhui03 on 17/3/13.
 */
public class Main33 {
    public static void main(String[] args){
        int[] nums={3,1};
        System.out.println(search(nums,0,1,1));
    }
    public static int search(int[] nums,int left,int right,int target){
        int mid = (left+right)/2;
        int res = -1;
        if(left>right||mid>right||mid<left) return -1;
        if (nums[mid] == target) return mid;

        //左边有序
        if (nums[mid]>=nums[left]){

            if(nums[mid]<target) {
                return search(nums,mid+1,right,target);
            }else{
                res = search(nums,left,mid-1,target);
                if(res==-1){
                    return search(nums,mid+1,right,target);
                }else{
                    return res;
                }

            }
        }else{
            if(nums[mid]>target) {
                return search(nums,left,mid-1,target);
            }else{
                res =search(nums,mid+1,right,target);
                if(res==-1){
                   return search(nums,left,mid-1,target);
                }else {
                    return res;
                }

            }
        }

    }
}

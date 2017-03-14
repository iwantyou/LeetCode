public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];;
        if(nums.length==0) {
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int left = findLeft(nums,target,0,nums.length-1);
        int right =findRight(nums,target,0,nums.length-1);
        res[0] = left;
        res[1] = right;
        return res;
    }
    public int findLeft(int[] nums,int target,int i,int j){
        if(i>j) return -1;
        int mid = (i+j)/2;
        int tmp = nums[mid];
        if(tmp<target) return findLeft(nums,target,mid+1,j);
        if(tmp>target) return findLeft(nums,target,i,mid-1);
        if(tmp==target&&mid-1>=0&&nums[mid-1]==target){
            return findLeft(nums,target,i,mid-1);
        }
        if(tmp==target) return mid;
        return -1;
    }
    public int findRight(int[] nums,int target,int i,int j){
        if(i>j) return -1;
        int mid = (i+j)/2;
        int tmp = nums[mid];
        if(tmp<target) return findRight(nums,target,mid+1,j);
        if(tmp>target) return findRight(nums,target,i,mid-1);
        if(tmp==target&&mid+1<nums.length&&nums[mid+1]==target){
            return findRight(nums,target,mid+1,j);
        }
        if(tmp==target) return mid;
        return -1;
    }
}

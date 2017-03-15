/**
 * Created by wangwenhui03 on 17/3/15.
 */
public class Main74 {

    public static void main(String[] args){
        Main74 main74 =new Main74();
        int[][]matrix = {
                {1,3,5,7},{10,11,16,20},{23,30,34,50}
        };
        System.out.println(main74.searchMatrix(matrix,31));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
        return func(matrix, target,0,matrix.length-1);
    }
    public boolean func(int[][] matrix, int target,int line,int last){
        if(line>last) return false;
        int mid = (line+last)/2;
        if(matrix[mid][0]==target) return true;
        else if(matrix[mid][0]<target){
            if(matrix[mid][matrix[mid].length-1]>target) return search(matrix[mid],target);
            else if(matrix[mid][matrix[mid].length-1]==target) return true;
            else return func(matrix,target,mid+1,last);
        }else {
            return func(matrix,target,line,last-1);
        }

    }
    public boolean search(int[] nums,int target){
        int i=0;
        int j=nums.length;
        while(i<=j){
            int mid =(i+j)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return false;
    }
}

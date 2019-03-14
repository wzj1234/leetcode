import java.util.Arrays;

public class two_sum {
//    https://leetcode-cn.com/problems/two-sum/
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {2, 5, 3};
        int target = 8;
        int[] res = twoSum(nums, target);
        for(int num:res){
            System.out.print(num);
            System.out.println(" ");
        }
    }
}

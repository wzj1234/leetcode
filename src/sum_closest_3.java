public class sum_closest_3 {
//    https://leetcode-cn.com/problems/3sum-closest/
//    middle
    public static int threeSumClosest(int[] nums, int target) {
        if(nums.length<3){
            return target;
        }
        int res = nums[0] + nums[1] + nums[2];
        int temp = res;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                for(int k=2;k<nums.length;k++){
                    if(i==j || i==k || j==k){
                        continue;
                    }
                    temp = nums[i] + nums[j] + nums[k];
                    if(temp == target){
                        return target;
                    }
                    if(Math.abs(temp-target)<Math.abs(res-target)){
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}

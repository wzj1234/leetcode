public class container_with_most_water {
//    https://leetcode-cn.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {
        int res = 0;
        int temp = 0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                temp = (j-i)*Math.min(height[i], height[j]);
                if(temp>res){
                    res = temp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

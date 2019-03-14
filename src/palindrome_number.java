public class palindrome_number {
    public static boolean isPalindrome(int x){
//        https://leetcode-cn.com/problems/palindrome-number/
        boolean res = true;
        if(Math.abs(x) < 10){
            if(x<0){
                return false;
            }
            return res;
        }
        String tempStr = Integer.toString(x);
        int i = 0;
        int j = tempStr.length()-1;
        while (i<j){
            if(tempStr.charAt(i)!=tempStr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return res;
    }
    public static void main(String[] args){
        int x = -1;
        System.out.println(isPalindrome(x));
    }
}

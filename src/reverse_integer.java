public class reverse_integer {
    public static int reverse(int x){
        int res = 0;
        String tempStr = Integer.toString(Math.abs(x));
        String newTempStr = "";
        int k = tempStr.length()-1;
        while (k>=0){
            if (tempStr.charAt(k) != '0') {
                break;
            }
            k--;
        }
        for(int i = k; i>=0; i--){
            newTempStr = newTempStr + "" + tempStr.charAt(i);
        }
        if(newTempStr=="")
            return 0;
        System.out.println(newTempStr + "newTempStr");
        try {
            res = Integer.parseInt(newTempStr);
        } catch (Exception e){
            return 0;
        }
        if(x<0){
            res = 0 - res;
        }
        return res;
    }
    public static void main(String[] args){
        int x = 1534236469;
        System.out.println(reverse(x));
        System.out.println("end");
    }
}

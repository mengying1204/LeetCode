package leetCode;

/**
 * Input:  123   -123   120
 * Output: 321  -321    21
 */
public class Solution_07 {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            if (Math.abs(result) > Integer.MAX_VALUE/10) {
                return 0;
            }
            if (x/10 != 0){
                result = result*10 + (x%10)*10;
            }else{
                result = result + x%10;
            }
            x = x/10;
        }
        /**   -123 % 10 = -3   -123 / 10 = -12    */
        /*if (x < 0) {
            result = result *(-1);
        }*/
        return result;
    }
    public static int reverse2(int x) {
        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > Integer.MAX_VALUE/10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = Solution_07.reverse(-1230);
        System.out.println(result);
//        System.out.println(-123/10);
//        System.out.println(-123%10);
    }
}

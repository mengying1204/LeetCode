package leetCode;

import java.util.HashMap;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution_01 {
    /**1
     * 暴力遍历查询  时间复杂度将为O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }

    /**
     * 使用HashMap将时间复杂度将为O(n),空间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num1 = target - nums[i];
            if (map.containsKey(num1)){
                return new int[] {map.get(num1),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] result = Solution_01.twoSum1(nums,target);
        int[] result = Solution_01.twoSum2(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}

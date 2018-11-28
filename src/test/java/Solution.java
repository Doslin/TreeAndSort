import java.util.HashMap;
import java.util.Map;

/**
 *
 * 使用查找表
 * leetcode第一号题
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

//        int [] arr = new int[2];
        HashMap<Integer,Integer> record = new HashMap<Integer, Integer>();
        for (int i = 0; i <nums.length ; i++) {
            int complement = target- nums[i];
            if(record.containsKey(complement)){
                int [] res = {i,record.get(complement)};
                return res;
            }
            record.put(nums[i],i);
        }
        throw new IllegalStateException("this input has no solution");
    }




}
package Top100;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/*
 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 你可以按任意顺序返回答案。
 输入：nums = [3,2,4], target = 6
 输出：[1,2]
 */
public class TwoNumberSum
{
    @Test
    public void test()
    {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
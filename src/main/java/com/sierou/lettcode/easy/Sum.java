package com.sierou.lettcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghongyue
 * 2019-10-25 10:12 上午
 **/
public class Sum {

    public static void main(String[] args) {
        int[] nums = {2, 14, 11, 3, 9, 9, 5, 7};
        int target = 9;
//        int[] ints = twoSum(nums, target);
        int[] ints = twoSumByHash(nums, target);
        System.out.println(ints[0] + "," + ints[1]);
    }


    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not match");
    }


    private static int[] twoSumByHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index = target - nums[i];
            if (map.containsKey(index)) {
                return new int[]{map.get(index), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("not match");
    }
}

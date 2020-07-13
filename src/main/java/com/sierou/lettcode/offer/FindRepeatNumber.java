package com.sierou.lettcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *  
 * <p>
 * 限制：
 * <p>
 * 2 <= n <= 100000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghongyue
 * 2020-07-13 8:55 上午
 **/
public class FindRepeatNumber {

    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 0, 2, 5, 3};

        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        int lenth = nums.length;
        if (2 > lenth || lenth > 100000) {
            throw new IllegalArgumentException("fail");
        }

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                return nums[i];
            }
            numMap.put(nums[i], i);
        }
        return 0;
    }
}

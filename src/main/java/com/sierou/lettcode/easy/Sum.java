package com.sierou.lettcode.easy;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghongyue
 * 2019-10-25 10:12 上午
 **/
public class Sum {

    public static void main(String[] args) {
        int[] nums = {3,14,11,3,9,9,5,7};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + "," + ints[1]);
    }


    private static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                      if (nums[i] + nums[j] == target){
                          temp[0] = i;
                          temp[1] = j;
                      }
                }
            }
        }
        return temp;
    }
}

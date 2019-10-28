package com.sierou.lettcode.easy;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wanghongyue
 * 2019-10-28 9:28 上午
 **/
public class Palindrome {

    private static boolean isPalindrome(int x) {
        int tmpx = x;
        int rev = 0;

        // x = 0 或者 负数 都不是回文数
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while (x != 0) {
            int pop = x % 10;
            // 个位数除10，得0
            x = x / 10;
            rev = rev * 10 + pop;
        }

        return rev == tmpx;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}

package com.gewuyou.algorithm.dailyquestion;

/**
 * 2710. 移除字符串中的尾随零
 *
 * @author gewuyou
 * @since 2024-06-29 下午1:04:43
 */
public class RemoveTrailingZerosFromStrings {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int i = n - 1;
        while (i >= 0 && num.charAt(i) == '0') {
            i--;
        }
        return i == n - 1? num : num.substring(0, i + 1);
    }
}

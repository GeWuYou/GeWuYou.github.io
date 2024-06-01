package com.gewuyou.algorithm.dailyquestion;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 503. 下一个更大元素 II
 *
 * @author gewuyou
 * @since 2024-06-24 下午12:21:56
 */
public class NextBiggerElementII {
    public int[] nextGreaterElements(int[] nums) {
        // int n = nums.length;
        // int[] result = new int[n];
        // Arrays.fill(result, -1);
        // for (int i = 0; i < n; i++) {
        //     int j = i;
        //     for (; ; ) {
        //         j = (j + 1) % n;
        //         if (nums[j] > nums[i]) {
        //             result[i] = nums[j];
        //             break;
        //         } else if (j == i) {
        //             break;
        //         }
        //     }
        // }
        // return result;
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }
}

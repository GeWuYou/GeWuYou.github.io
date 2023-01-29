package com.gewuyou.algorithm.problem;

/**
 * 牛客网链表节点
 *
 * @author GeWuYou
 * @version V1.0.0
 * @ClassName ListNode
 * @apiNote </br>
 * @since 2022/11/17 16:37
 */
public class ListNode {

    /**
     * 数据
     */
    int val;
    /**
     * 下一节点索引
     */
    ListNode next = null;

    /**
     * 构造方法
     * @param val 数据
     */
    ListNode(int val) {
        this.val = val;
    }
}
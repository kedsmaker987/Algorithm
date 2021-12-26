package com.kejian._day6;

/**
 * 给你两个整数 left 和 right ，表示区间 [left, right] ，返回此区间内所有数字 按位与 的结果（包含 left 、right 端点）。
 */
public class Soluction201 {
    // 有这么一个逻辑，因为时连续的，所以除公共部位以外都是位为0
    public int rangeBitwiseAnd(int left, int right) {
        // 左移动到相等为止
        int count = 0;
        while (left!=right){
            left>>=1;
            right>>=1;
            count++;
        }
        return left<<=count;
    }
}

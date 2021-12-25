package com.kejian._day6;

/**
 * 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 *
 * 给你一个整数数组 nums，请你计算并返回 nums 中任意两个数之间 汉明距离的总和 。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/total-hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Soluction477 {
    // 数组每一个数字二进制每一位做对比，此时计算和为n(size-n)
    public int totalHammingDistance(int[] nums) {
        int totalNum = 0;
        for(int i=0;i<32;i++){
            int oneNum = 0;
            for(int j=0;j<nums.length;j++){
                if((nums[j] & 1<<i)!=0){
                    oneNum++;
                }
            }
            totalNum += oneNum*(nums.length-oneNum);
        }
        return totalNum;
    }
}

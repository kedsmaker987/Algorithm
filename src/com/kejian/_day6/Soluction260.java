package com.kejian._day6;

/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 */
public class Soluction260 {

    // 数组异或 相同^为0
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums){
            res = res ^ num;
        }

        // res 为出现一次两个元素的异或，找到最后一位1，说明两个数中一个为1 一个为0,其他都出现两个元素，可以分组解决
        int lastOne = res & (-res);
        // 异或分组
        int num1 = 0;
        int num2 = 0;
        for(int num:nums){
            if((num & lastOne)!=0){
                num1 = num1^num;
            }else {
                num2 = num2^num;
            }
        }

        return new int[]{num1,num2};

    }
}

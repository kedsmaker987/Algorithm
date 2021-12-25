package com.kejian._day6;

/**
 * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 */
public class Soluction137 {
    // 二进制每一位中出现1的个数时3的倍数或者0，如果不是代表其中出现了这个元素。
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<32;i++){
            int oneNum =0;
            for(int num:nums){
                if((num & 1<<i)!=0){
                    oneNum++;
                }
            }

            if(oneNum%3!=0){
                res |= (1<<i);
            }
        }
        return res;
    }

}

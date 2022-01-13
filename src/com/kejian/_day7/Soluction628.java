package com.kejian._day7;

/**
 * @auth hukj001
 * 628. 三个数的最大乘积
 * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积
 * 提示：
 *
 * 3 <= nums.length <= 104
 * -1000 <= nums[i] <= 1000
 **/
public class Soluction628 {
    /**
     * 可能存在情况
     * 1.最后三个为正数,乘积最大
     * 2.最小两个都为负数，乘以最大的一位
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        // 罗列出所有情况
        // 最大
        int max1 = Integer.MIN_VALUE;
        // 第二大
        int max2 = Integer.MIN_VALUE;
        // 第三大
        int max3 = Integer.MIN_VALUE;

        // 最小
        int min1 = Integer.MAX_VALUE;
        // 第二小
        int min2 = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            // nums[i] 最大
            if(nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i]>max2){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i]>max3){
                max3 = nums[i];
            }
            if(nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]<min2){
                min2 = nums[i];
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }

    public static void main(String[] args){
        Soluction628 soluction628 = new Soluction628();
        soluction628.maximumProduct(new int[]{-1,-2,-3});
    }
}

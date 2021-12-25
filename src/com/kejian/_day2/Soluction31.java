package com.kejian._day2;

/**
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Soluction31 {

    /**
     * 解析: 反向 从左向右,找到第一个比它右边小的值
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        if(nums.length ==1){
            return;
        }
        int i = nums.length-2;
        // 遍历右侧较小值
        while (i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        // 完全降序，直接升序
        if(i ==-1){
            reverse(nums,0,nums.length-1);
            return;
        }

        //交换较小值与右侧比它大的最小值
        int minMax = nums[i+1];
        int minIndex = i+1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i] && nums[j]<=minMax){
                minMax = nums[j];
                minIndex = j;
            }
        }
        // 交换顺序
        swap(nums,i,minIndex);

        // i 后的数据从小到大排列 把降序变成升序
        reverse(nums,i+1,nums.length-1);


    }

    private void reverse(int[] nums,int i,int j){
        while (j>i){
            swap(nums,i,j);
            j--;
            i++;
        }
    }


    private void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Soluction31 test = new Soluction31();
        int[] param = new int[]{2,3,1,3,3};
        test.nextPermutation(param);
    }
}

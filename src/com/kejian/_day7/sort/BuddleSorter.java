package com.kejian._day7.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 冒泡次数+比较次数
 */
public class BuddleSorter extends Sorter{

    public void sort(int[] data){
        if(data == null || data.length<=1){
            return;
        }
        // 冒泡次数
        for(int i=1;i<=data.length;i++){
            boolean hasSwap = false;
            // 比较次数
            int compareTime = data.length-i;
            for(int j=0;j<compareTime;j++){
                if(data[j]>data[j+1]){
                    swap(data,j,j+1);
                    hasSwap = true;
                }
            }
            // 本轮没有交换，说明已排序完毕
            if(!hasSwap){
                break;
            }
        }
    }



    public static void main(String[] args) {
        int[] data = new int[]{12,23,43,9,23};
        new BuddleSorter().sort(data);
        System.out.printf(Arrays.toString(data));
    }
}

package com.kejian._day7.sort;

import java.util.Arrays;

/**
 * 选择排序 每一位 =此位后最小值
 */
public class SelectorSorter extends Sorter{

    public void sort(int[] data){
        if(data == null || data.length == 1){
            return;
        }
        // 遍历每一位,取最小值交换
        for(int i=0;i<data.length;i++){

            int min = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            swap(data,i,min);
        }
    }


    public static void main(String[] args) {
        int[] data = new int[]{12, 23, 43, 9, 23};
        new SelectorSorter().sort(data);
        System.out.printf(Arrays.toString(data));
    }
}

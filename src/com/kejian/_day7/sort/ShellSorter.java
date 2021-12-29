package com.kejian._day7.sort;

import java.util.Arrays;

/**
 * shell排序,这就是特殊的insert排序
 */
public class ShellSorter extends Sorter{
    // (3*n-1)/2; 间隔不超过n/3
    public void sort(int[] data){
        int h = 1;
        while (h<=data.length/3){
            h = 3*h +1;
        }
        // 插入排序
        while (h>=1){
            for(int i=h;i<data.length;i++){
                int tmp = data[i];
                int j;
                for(j = i;j>=h;j-=h){
                    if(data[j-h]>tmp){
                        data[j] = data[j-h];
                    }else {
                        break;
                    }
                }
                // 保持到最后一个赋值
                data[j] = tmp;
            }
            h = (h-1)/3;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{12,23,43,9,23};
        new ShellSorter().sort(data);
        System.out.printf(Arrays.toString(data));
    }
}

package com.kejian._day7.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSorter extends Sorter{

    public void sort(int[] data){
        if(data == null || data.length<=1){
            return;
        }

        for(int i=1;i<data.length;i++){
            int tmp = data[i];
            int j;
            for(j=i;j>=1;j--){

                if(data[j-1]>tmp){
                    data[j] = data[j-1];
                }else {
                    break;
                }
            }
            data[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{12, 23, 43, 9, 23};
        new InsertSorter().sort(data);
        System.out.printf(Arrays.toString(data));
    }
}

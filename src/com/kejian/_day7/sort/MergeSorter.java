package com.kejian._day7.sort;

/**
 * 归并排序
 */
public class MergeSorter extends Sorter{

    // 归并排序，先分，后合
    public void sort(int[] data){

    }

    private void sort(int[] data,int left,int right){
        // 递归-》边界
        if(left == right) return;
        int mid = left + (right-left)/2;
        // 默认分完后已经已经排序完毕了  left ->mid排序
        sort(data,left,mid);
        sort(data,mid+1,right); // mid+1 -> right 排序
        merge(data,left,mid,right);
    }
    // 合并
    private void merge(int[] data,int left,int mid,int right){
        // 默认 lef ->mid 有序
        // 默认 mid+1 ->right 有序
        int[] tmp = new int[right-left+1];

        while (left<=mid && right<data.length){
            if(data[left]>data[right]){

            }
        }
    }
}

package com.kejian._day7.sort;

public class Sorter {

    public void swap(int[] data,int i,int j){
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}

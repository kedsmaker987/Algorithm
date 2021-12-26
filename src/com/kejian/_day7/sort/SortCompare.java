package com.kejian._day7.sort;

import java.util.Random;

public class SortCompare {

    private static Random random = new Random();

    private static int[] getData(int n){
        int[] data =new int[n];

        for (int i=0;i<n;i++){
            data[i] = random.nextInt();
        }

        return data;
    }

    private static double manyTimesSort(String sortType,int n,int k){
        long totalTime = 0;
        for (int i=0;i<k;i++){
            totalTime += time(sortType,getData(k));
        }
        return totalTime;
    }

    private static double time(String sortType,int[] data){
        double start = System.currentTimeMillis();
        if(sortType.equals("bubble")){
            new BuddleSorter().sort(data);
        }else if(sortType.equals("selection")){
            new SelectorSorter().sort(data);
        }else if(sortType.equals("insertion")){
            new InsertSorter().sort(data);
        }

        return System.currentTimeMillis() -start;
    }

    public static void main(String[] args) {
        double t1 = time("bubble",getData(1000));
        double t2 = time("selection",getData(1000));
        double t3 = time("insertion",getData(1000));
        System.out.println(t1/t2);
        System.out.println(t2/t3);
    }
}

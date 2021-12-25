package com.kejian._day6;

/**
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class Soluction461 {
    // 异或之后1的个数
    public int hammingDistance(int x, int y) {
        int m = x^y;
        int res = 0;
        for(int i=0;i<32;i++){
            if((m & 1<<i)!=0){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Soluction461 soluction = new Soluction461();
        soluction.hammingDistance(1,4);
    }
}

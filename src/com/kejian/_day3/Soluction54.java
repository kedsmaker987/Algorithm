package com.kejian._day3;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/spiral-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Soluction54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        // 模拟法则
        // 1.开始时row 不变 col加1 col<n
        // 2.col不变 row+1 row<m
        // 3.row不变 col -1 col>=0
        // 4.col不变 row-1 row>
        // 设定走过之后所有的值设置为0
        List<Integer> resultList = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        // 数量小于m*n停止
        while (resultList.size() <m*n){


        }

        return resultList;
    }
}

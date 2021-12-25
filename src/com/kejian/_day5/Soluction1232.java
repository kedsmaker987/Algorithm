package com.kejian._day5;

/**
 * 在一个XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 *
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-it-is-a-straight-line
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Soluction1232 {
    /**
     * 斜率相等,但是我们不能用除法直接恒等:要考虑到除数为0的问题
     * A/B = C/D ===> AD = BC
     * @param coordinates
     * @return
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int xa = coordinates[1][0]-coordinates[0][0];
        int ya = coordinates[1][1] - coordinates[0][1];
        for(int i=2;i<coordinates.length;i++){
            int xb = coordinates[i][0]-coordinates[0][0];
            int yb = coordinates[i][1]-coordinates[0][1];
            if(xa*yb!= ya*xb){
                return false;
            }

        }

        return true;
    }
}

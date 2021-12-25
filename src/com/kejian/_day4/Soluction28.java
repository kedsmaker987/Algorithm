package com.kejian._day4;

/**
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 *  
 *
 * 说明：
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 最基本的kmp算法,主要掌握next[]含义
 */
public class Soluction28 {

    public int strStr(String haystack, String needle) {
        // 获取next下标后开始最匹配
        char[] masterArray = haystack.toCharArray();
        char[] patterArray = needle.toCharArray();
        // 主串位置
        int i = 0;
        // 子串位置
        int j = 0;
        int next[] = getNext(needle);
        while (i<masterArray.length && j<patterArray.length){
            // 多一个判断 j==-1 ,本次没有匹配数据，子串从回0位置
            if(j==-1 || masterArray[i] == patterArray[j]){
                i++;
                j++;
            }else {
                j = next[j];
            }
        }

        if(j == patterArray.length){
            return i-j;
        }else {
            return -1;
        }
    }

    /**
     * 获取next下标 next[k]==-1,本次没有匹配到的,主串++
     * @return
     */
    private int[] getNext(String pattern){
        char[] patternArry = pattern.toCharArray();
        int[] next = new int[pattern.length()];
        next[0] = -1;
        int j = 0;
        // k,匹配的最大下标
        int k = -1;
        while (j<pattern.length()){
            // k==-1 ,本次匹配为-1,都向前移动
            if(k==-1 || patternArry[k] == patternArry[j]){
                next[j] = k;
                j++;
                k++;
            }else {
                k = next[j-1];
            }
        }
        return next;
    }


}

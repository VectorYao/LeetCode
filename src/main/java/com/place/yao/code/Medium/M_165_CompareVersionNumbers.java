package com.place.yao.code.Medium;

/**
 * @Description 版本比较（https://leetcode.com/problems/compare-version-numbers/）
 * @Author vectoryao
 * @Date 2022/2/25
 **/
public class M_165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int v1Len = version1.length(), v2Len = version2.length();
        int i = 0, j = 0;
        while (i < v1Len || j < v2Len) {
            int x = 0;
            for (; i < v1Len && version1.charAt(i) != '.'; ++i) {
                x = x * 10 + version1.charAt(i) - '0';
            }
            ++i; // 跳过点号
            int y = 0;
            for (; j < v2Len && version2.charAt(j) != '.'; ++j) {
                y = y * 10 + version2.charAt(j) - '0';
            }
            ++j; // 跳过点号
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        M_165_CompareVersionNumbers m165CompareVersionNumbers = new M_165_CompareVersionNumbers();
        System.out.println(m165CompareVersionNumbers.compareVersion("0.1", "1.1"));
    }
}

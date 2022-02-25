package com.place.yao.code.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description 350. 两个数组的交集 II(https://leetcode.com/problems/intersection-of-two-arrays-ii/)
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class E_350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int result[] = new int[list.size()];
        for (int n = 0; n < list.size(); n++) {
            result[n] = list.get(n);
        }
        return result;
    }

    public static void main(String[] args) {
        E_350_IntersectionOfTwoArraysII e = new E_350_IntersectionOfTwoArraysII();
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] result = e.intersect(nums1, nums2);
        for (int i : result) {
            System.out.println(i);
        }
    }

}

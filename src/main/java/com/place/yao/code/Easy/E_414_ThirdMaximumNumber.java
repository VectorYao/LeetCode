package com.place.yao.code.Easy;

import java.util.TreeSet;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/13/21 12:23 AM
 **/
public class E_414_ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet();

        for (int num : nums) {
            treeSet.add(num);
        }

        int k = 1;
        if (treeSet.size() <= 2) {
            return treeSet.last();
        } else {
            while (k < 3) {
                treeSet.pollLast();
                k++;
            }

            return treeSet.pollLast();
        }
    }
}

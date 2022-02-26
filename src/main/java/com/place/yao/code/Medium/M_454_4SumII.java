package com.place.yao.code.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 4数之和II
 * @Author vectoryao
 * @Date 2022/2/25
 **/
public class M_454_4SumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                map.put(nums1[i] + nums2[j], map.getOrDefault(nums1[i] + nums2[j], 0) + 1);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                res += map.getOrDefault(-nums3[i] - nums4[j], 0);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        M_454_4SumII m = new M_454_4SumII();
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(m.fourSumCount(nums1, nums2, nums3, nums4));
    }
}

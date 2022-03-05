package com.place.yao.code.Medium;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description 混乱数组（https://leetcode.com/problems/shuffle-an-array/）
 * @Author vectoryao
 * @Date 2022/3/1
 **/
public class M_384_ShuffleArray {

    class Solution {
//        int[] nums;
//        int[] original;
//        public Solution(int[] nums) {
//            this.nums = nums;
//            original = new int[nums.length];
//            System.arraycopy(nums, 0, original, 0, nums.length);
//        }
//
//        /** Resets the array to its original configuration and return it. */
//        public int[] reset() {
//            System.arraycopy(original, 0, nums, 0, nums.length);
//            return nums;
//        }
//
//        /** Returns a random shuffling of the array. */
//        public int[] shuffle() {
//            for (int i = 0; i < nums.length; i++) {
//                int j = (int)(Math.random() * (i + 1));
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//            }
//            return nums;
//        }
//    }

        private int[] orig;
        private int[] copy;
        private Random random = new Random();

        public Solution(int[] nums) {
            orig = nums.clone();
            copy = nums;
        }

        public int[] reset() {
            return orig;
        }

        public int[] shuffle() {
            int index = random.nextInt(copy.length - 1);
            int t = copy[index];
            copy[index] = copy[copy.length - 1];
            copy[copy.length - 1] = t;
            return copy;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new M_384_ShuffleArray().new Solution(nums);
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.reset()));
    }
}

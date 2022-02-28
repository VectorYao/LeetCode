package com.place.yao.code.Medium;

import java.util.PriorityQueue;

/**
 * @Description 数组中第K个最大元素（https://leetcode.com/problems/kth-largest-element-in-an-array/）
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_215_KthLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return -1;

        return findKthLargest(nums, 0, nums.length - 1, --k);
    }

    private int findKthLargest(int[] nums, int start, int end, int k) {
        int pivot = nums[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && nums[right] <= pivot) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] >= pivot) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        if (left == k) {
            return nums[left];
        } else if (left < k) {
            return findKthLargest(nums, left + 1, end, k);
        } else {
            return findKthLargest(nums, start, left - 1, k);
        }
    }


//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for (int num : nums) {
//            queue.add(num);
//            if (queue.size() > k) {
//                queue.poll();
//            }
//        }
//        return queue.poll();
//    }
    public static void main(String[] args) {
        M_215_KthLargestElementArray solution = new M_215_KthLargestElementArray();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(solution.findKthLargest(nums, k));
    }
}

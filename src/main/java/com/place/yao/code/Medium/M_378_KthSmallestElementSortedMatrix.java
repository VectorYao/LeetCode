package com.place.yao.code.Medium;

import java.util.PriorityQueue;

/**
 * @Description: 378. Kth Smallest Element in a Sorted Matrix(https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_378_KthSmallestElementSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < matrix.length; i++) {
            pq.offer(new int[]{matrix[0][i], 0, i});
        }

        for (int i = 0; i < k - 1; i++) {
            int[] cur = pq.poll();
            if (cur[1] < matrix.length - 1) {
                pq.offer(new int[]{matrix[cur[1] + 1][cur[2]], cur[1] + 1, cur[2]});
            }
        }
        return pq.poll()[0];
    }

    public static void main(String[] args) {
        M_378_KthSmallestElementSortedMatrix m = new M_378_KthSmallestElementSortedMatrix();
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(m.kthSmallest(matrix, 8));
    }
}

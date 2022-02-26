package com.place.yao.code.Medium;

import java.util.*;

/**
 * @Description 最高频率的K个元素
 * @Author vectoryao
 * @Date 2022/2/25
 **/
public class M_347_TopKFrequentElements {
//    public int[] topKFrequent(int[] nums, int k) {
//        // 统计数组中每个数字出现次数
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int n : nums) {
//            int count = map.getOrDefault(n, 0) + 1;
//            map.put(n, count);
//        }
//        // 将map中的数据按照value（出现次数）降序排序
//        PriorityQueue<Map.Entry<Integer, Integer>> q =
//                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
//        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//            q.offer(e);
//        }
//        // 取得Queue中前k个元素
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            res.add(q.poll().getKey());
//        }
//        return res.stream().mapToInt(i -> i).toArray();
//    }

    //桶排序
    public int[] topKFrequent(int[] nums, int k) {
        // 统计数组中每个数字出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (bucket[count] == null) {
                bucket[count] = (new ArrayList<>());
            }
            bucket[count].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && index < k; j++) {
                    res[index++] = bucket[i].get(j);
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        M_347_TopKFrequentElements m = new M_347_TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = m.topKFrequent(nums, k);
        for (int i : res) {
            System.out.println(i);
        }
    }
}

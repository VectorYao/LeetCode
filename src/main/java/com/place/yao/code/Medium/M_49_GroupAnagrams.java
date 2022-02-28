package com.place.yao.code.Medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: 49. 字母异位词分组(https://leetcode.com/problems/group-anagrams/)
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_49_GroupAnagrams {
    // 思路：排序后比较
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = String.valueOf(chars);
            if (map.containsKey(sortStr)) {
                map.get(sortStr).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortStr, list);
            }
        }
        return map.values().stream().collect(Collectors.toList());
    }


    // 思路：统计后比较
//    public List<List<String>> groupAnagrams(String[] strs) {
//        if(strs == null || strs.length == 0) return new ArrayList<>();
//
//        Map<String, List<String>> map = new HashMap<>();
//        for(String str:strs){
//            int[] count = new int[26];
//            for(char ch:str.toCharArray()){
//                count[ch-'a']++;
//            }
//            String num = Arrays.toString(count);
//            if(map.containsKey(num)){
//                map.get(num).add(str);
//            }else{
//                List<String> list = new ArrayList<>();
//                list.add(str);
//                map.put(num,list);
//            }
//        }
//
//        return new ArrayList<>(map.values());
//    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        M_49_GroupAnagrams groupAnagrams = new M_49_GroupAnagrams();
        List<List<String>> list = groupAnagrams.groupAnagrams(strs);
        System.out.println(list);
    }

}


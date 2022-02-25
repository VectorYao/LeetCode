package com.place.yao.code.Easy;

import java.util.Map;

/**
 * @Description 首次出现的字符（https://leetcode.com/problems/first-unique-character-in-a-string/）
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class E_387_FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        E_387_FirstUniqueCharacter e = new E_387_FirstUniqueCharacter();
        System.out.println(e.firstUniqChar("loveleetcode"));
    }
}

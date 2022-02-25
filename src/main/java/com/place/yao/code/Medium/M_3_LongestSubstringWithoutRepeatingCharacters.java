package com.place.yao.code.Medium;

/**
 * @Description 最长无重复字符的子串（https://leetcode.com/problems/longest-substring-without-repeating-characters/）
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class M_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        int[] map = new int[256];
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map[c] == 0) {
                map[c] = 1;
                right++;
                max = Math.max(max, right - left);
            } else {
                map[s.charAt(left)] = 0;
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        M_3_LongestSubstringWithoutRepeatingCharacters m = new M_3_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(m.lengthOfLongestSubstring("abcabcbb"));
    }
}

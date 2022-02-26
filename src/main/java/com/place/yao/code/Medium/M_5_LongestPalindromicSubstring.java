package com.place.yao.code.Medium;

/**
 * @Description 最长回文子串（https://leetcode.com/problems/longest-palindromic-substring/）
 * @Author vectoryao
 * @Date 2022/2/26
 **/
public class M_5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int maxLen = 0, maxStart = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            if (len1 > maxLen) {
                maxLen = len1;
                maxStart = i - len1 / 2;
            }

            if (len2 > maxLen) {
                maxLen = len2;
                maxStart = i - len2 / 2 + 1;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public int expandAroundCenter(String s, int left, int right) {
        int len = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            len = right - left + 1;
            left--;
            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "aacdefcaa";
        M_5_LongestPalindromicSubstring m = new M_5_LongestPalindromicSubstring();
        System.out.println(m.longestPalindrome(s));
    }

}

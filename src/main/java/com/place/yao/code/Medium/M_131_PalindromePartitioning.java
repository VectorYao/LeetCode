package com.place.yao.code.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 字符串的回文分割
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_131_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(new ArrayList<>(), s, res);
        return res;
    }

    private void helper(List<String> cur, String remain, List<List<String>> allList) {
        if (remain.length() == 0) {
            allList.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 1; i <= remain.length(); i++) {
            String sub = remain.substring(0, i);
            if (isPalindrome(sub, 0, sub.length() - 1)) {
                cur.add(sub);
                helper(cur, remain.substring(i), allList);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        M_131_PalindromePartitioning m131 = new M_131_PalindromePartitioning();
        System.out.println(m131.partition("aab"));
    }
}

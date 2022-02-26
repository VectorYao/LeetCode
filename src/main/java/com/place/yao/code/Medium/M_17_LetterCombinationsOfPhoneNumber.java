package com.place.yao.code.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 电话号码的字母组合（https://leetcode.com/problems/letter-combinations-of-a-phone-number/）
 * @Author vectoryao
 * @Date 2022/2/26
 **/
public class M_17_LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] letters = new String[]{" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        char[] cur = new char[digits.length()];
        dfs(digits, letters, 0, cur, result);
        return result;
    }

    public void dfs(String digits, String[] letters, int currentIndex, char[] cur, List<String> result) {
        if (currentIndex >= digits.length()) {
            // 这里再加一个判定主要是因为testcase会有一个输入是""
            if (currentIndex > 0) result.add(new String(cur));
            return;
        }

        String currentIterate = letters[Character.getNumericValue(digits.charAt(currentIndex))];
        for (int i = 0; i < currentIterate.length(); i++) {
            cur[currentIndex] = currentIterate.charAt(i);
            dfs(digits, letters, currentIndex + 1, cur, result);
        }
    }

    public static void main(String[] args) {
        M_17_LetterCombinationsOfPhoneNumber solution = new M_17_LetterCombinationsOfPhoneNumber();
        List<String> result = solution.letterCombinations("23");
        System.out.println(result);
    }
}

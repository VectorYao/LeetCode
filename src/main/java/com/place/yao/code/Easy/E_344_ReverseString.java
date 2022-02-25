package com.place.yao.code.Easy;

/**
 * @Description 翻转字符串（https://leetcode.com/problems/reverse-string/）
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class E_344_ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

    public static void main(String[] args) {
        E_344_ReverseString e = new E_344_ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        e.reverseString(s);
        System.out.println(s);
    }
}

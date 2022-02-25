package com.place.yao.code.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 嗡嗡声（https://leetcode.com/problems/fizz-buzz/）
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class E_412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        E_412_FizzBuzz fizzBuzz = new E_412_FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }
}

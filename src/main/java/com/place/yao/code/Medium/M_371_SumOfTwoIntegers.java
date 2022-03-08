package com.place.yao.code.Medium;

/**
 * @Description 两个整数之和（https://leetcode.com/problems/sum-of-two-integers/）
 * @Author vectoryao
 * @Date 2022/3/8
 **/
public class M_371_SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0) {
            return getSum(sum, carry);
        }
        return sum;
    }

    public static void main(String[] args) {
        M_371_SumOfTwoIntegers sumOfTwoIntegers = new M_371_SumOfTwoIntegers();
        System.out.println(sumOfTwoIntegers.getSum(3, 2));
    }

}

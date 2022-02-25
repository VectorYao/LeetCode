package com.place.yao.code.Easy;

/**
 * @Description 3的x次方（https://leetcode.com/problems/power-of-three/）
 * @Author vectoryao
 * @Date 2022/2/24
 **/
public class E_326_PowerOfThree {
    //    public boolean isPowerOfThree(int n) {
//        return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThree(n / 3)));
//    }
    public boolean isPowerOfThree(int n) {
        return n > 0 && Math.pow(3, 20) % n == 0;
    }

    public static void main(String[] args) {
        E_326_PowerOfThree e = new E_326_PowerOfThree();
        System.out.println(e.isPowerOfThree(27));
    }
}

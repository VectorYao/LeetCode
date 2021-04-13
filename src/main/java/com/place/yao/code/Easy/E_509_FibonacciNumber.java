package com.place.yao.code.Easy;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/14/21 12:08 AM
 **/
public class E_509_FibonacciNumber {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fib_iteration(n));
    }

    //递归实现
    private static int fib_iteration(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int f1 = 1;
            int f2 = 1;
            int f3 = 0;
            for (int i = 0; i < n - 2; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }

            return f3;
        }
    }


    //递归实现
    private static int fib_recursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib_recursion(n - 1) + fib_recursion(n - 2);
        }
    }
}

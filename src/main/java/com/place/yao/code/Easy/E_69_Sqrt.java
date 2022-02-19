package com.place.yao.code.Easy;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/10/21 7:34 PM
 **/
public class E_69_Sqrt {
    public static void main(String[] args) {
        int x = 12;
        System.out.println((int) binarySearch(x, 0, x));
    }

    private static long binarySearch(long target, long low, long high) {
        long mid = (high + low) / 2;
        long square = mid * mid;

        if (target == square) {
            return mid;
        } else if (square > target && (mid - 1) * (mid - 1) < target) {
            return mid - 1;
        } else if (square < target && (mid + 1) * (mid + 1) > target) {
            return mid ;
        } else if (square > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }

        return binarySearch(target, low, high);
    }
}

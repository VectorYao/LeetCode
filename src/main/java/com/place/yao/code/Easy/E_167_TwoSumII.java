package com.place.yao.code.Easy;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/11/21 11:28 PM
 **/
public class E_167_TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        int[] result = twoSum(numbers, target);
        System.out.printf("result = [%d,%d]", result[0], result[1]);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        int midR = 0;
        while (low < high) {
            midR = numbers[low] + numbers[high];

            if (midR == target) {
                break;
            } else if (midR > target) {
                high--;
            } else {
                low++;
            }
        }

        return new int[]{low + 1, high + 1};
    }

}

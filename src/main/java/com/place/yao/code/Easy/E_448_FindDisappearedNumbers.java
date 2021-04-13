package com.place.yao.code.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/14/21 12:45 AM
 **/
public class E_448_FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1,1};

        List<Integer> result = findDisappearedNumbers(nums);

        for (Integer i : result) {
            System.out.printf("%d, ", i);
        }

    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> flagNums = new ArrayList<>(n);
        IntStream.range(0, n).forEach(i -> flagNums.add(i, -1));
        Arrays.stream(nums).forEach(num -> flagNums.set(num - 1, 0));

        return IntStream.range(0, n).filter(i -> flagNums.get(i) != 0).mapToObj(i -> i + 1).collect(Collectors.toList());
    }

}

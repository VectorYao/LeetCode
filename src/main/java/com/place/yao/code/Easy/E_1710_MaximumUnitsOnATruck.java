package com.place.yao.code.Easy;

import java.util.Arrays;

/**
 * @Description
 * @Author vectoryao
 * @Date 4/10/21 6:36 PM
 **/
public class E_1710_MaximumUnitsOnATruck {

    public static void main(String[] args) {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;


        System.out.printf("Result = %d", maximumUnits(boxTypes, truckSize));
    }
    
    private static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxBoxes = 0;

        for (int[] a : boxTypes) {
            if (truckSize > 0) {
                maxBoxes += (truckSize > a[0] ? a[0] : truckSize) * a[1];
                truckSize -= a[0];
            }
        }

        return maxBoxes;
    }

}
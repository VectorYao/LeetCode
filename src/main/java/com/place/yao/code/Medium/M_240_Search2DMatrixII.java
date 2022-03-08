package com.place.yao.code.Medium;

/**
 * @Description 二维数组中的查找（https://leetcode.com/problems/search-a-2d-matrix-ii/）
 * @Author vectoryao
 * @Date 2022/3/8
 **/
public class M_240_Search2DMatrixII {
        public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i = row-1;
        int j = 0;
        while (i >=0 && j < col) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        M_240_Search2DMatrixII m = new M_240_Search2DMatrixII();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(m.searchMatrix(matrix, 20));
    }
}

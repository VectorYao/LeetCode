package com.place.yao.code.Easy;

/**
 * @Description excel表格代表的列号数值大小（https://leetcode.com/problems/excel-sheet-column-number/）
 * @Author vectoryao
 * @Date 2022/2/23
 **/
public class E_171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        E_171_ExcelSheetColumnNumber e = new E_171_ExcelSheetColumnNumber();
        System.out.println(e.titleToNumber("A"));
        System.out.println(e.titleToNumber("AB"));
        System.out.println(e.titleToNumber("ZY"));
    }
}

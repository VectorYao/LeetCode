package com.place.yao.code.Medium;

/**
 * @Description 生命游戏（https://leetcode.com/problems/game-of-life/）
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_289_GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if (m == 0) return;
        int n = board[0].length;
        if (n == 0) return;

        int[][] newBoard = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = countNeighbors(board, i, j);
                if (board[i][j] == 1) {
                    if (count < 2) {
                        newBoard[i][j] = 0;
                    } else if (count == 2 || count == 3) {
                        newBoard[i][j] = board[i][j];
                    } else if (count > 3) {
                        newBoard[i][j] = 0;
                    }
                } else {
                    if (count == 3) {
                        newBoard[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }

    private int countNeighbors(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        for (int x = Math.max(0, i - 1); x <= Math.min(m - 1, i + 1); x++) {
            for (int y = Math.max(0, j - 1); y <= Math.min(n - 1, j + 1); y++) {
                count += board[x][y];
            }
        }
        count -= board[i][j];
        return count;
    }

    public static void main(String[] args) {
        M_289_GameOfLife gameOfLife = new M_289_GameOfLife();
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}

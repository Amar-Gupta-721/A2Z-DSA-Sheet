package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        for (List<String> list : ans) {
            System.out.println(list);
        }
    }
    public static void placeQueen(char[][] board, int n, int row, List<List<String>> ans) {
        if (row == n) {
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer temp = new StringBuffer("");
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'Q')
                        temp.append("Q");
                    else
                        temp.append(".");
                }
                curr.add(temp.toString());
            }
            ans.add(curr);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 'Q';
                placeQueen(board, n, row + 1, ans);
                board[row][i] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, int n) {
        int r = row;
        int c = col;
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r < n && c < n) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c++;
        }
        r = row;
        c = col;
        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }
        r = row;
        c = col;
        while (r < n && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c--;
        }
        return true;
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        placeQueen(board, n, 0, ans);
        return ans;
    }
}

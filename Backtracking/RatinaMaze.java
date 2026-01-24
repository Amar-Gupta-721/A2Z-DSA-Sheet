package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatinaMaze {
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        ArrayList<String> ans = ratInMaze(maze);
        System.out.println(ans);
    }

    public static void helper(int[][] maze, boolean[][] visited, int row, int col, int n, StringBuffer dest, List<String> ans){
        if(row<0 || row>=n || col<0 || col>=n || visited[row][col] || maze[row][col]==0)return;
        if(row==n-1 && col==n-1){
            ans.add(dest.toString());
            return;
        }
        visited[row][col] = true;
        
        dest.append("D");
        helper(maze, visited, row+1, col, n, dest, ans);
        dest.deleteCharAt(dest.length() - 1);
        
        dest.append("L");
        helper(maze, visited, row, col-1, n, dest, ans);
        dest.deleteCharAt(dest.length() - 1);
        
        dest.append("R");
        helper(maze, visited, row, col+1, n, dest, ans);
        dest.deleteCharAt(dest.length() - 1);
        
        dest.append("U");
        helper(maze, visited, row-1, col, n, dest, ans);
        dest.deleteCharAt(dest.length() - 1);
        
        visited[row][col] = false;
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        boolean[][] visited = new boolean[maze.length][maze.length];
        ArrayList<String> ans = new ArrayList<>();
        helper(maze, visited, 0, 0, maze.length, new StringBuffer(""), ans);
        return ans;
    }
}

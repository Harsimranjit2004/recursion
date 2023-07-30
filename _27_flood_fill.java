package recursion;

import java.util.Scanner;

public class _27_flood_fill {
    public static void floodFill(int[][] maze,int row,int col,String ans , boolean[][] visited){
        if(row<0 || col<0 || row >=maze.length || col >= maze[0].length || maze[row][col] ==1 || visited[row][col] == true){
            return;
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;

        }
        visited[row][col] = true;
        floodFill(maze, row-1, col, ans+"t",visited);
        floodFill(maze, row, col-1, ans+'l',visited);
        floodFill(maze, row+1, col, ans+'d',visited);
        floodFill(maze, row, col+1, ans+'r',visited);
        visited[row][col] = false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0;i< arr.length;i++){
            for(int j = 0 ;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];

        floodFill(arr, 0, 0, "",visited);

    }
    
}

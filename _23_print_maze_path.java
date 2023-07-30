package recursion;

import java.util.Scanner;

public class _23_print_maze_path {
    public static void printMazePath(int sr, int sc, int n, int m, String ans){
        if(sr==n && sc==m){
            System.out.println(ans);
            return;
        }
        if(sr>n || sc>m){
            return;
        }
        printMazePath(sr+1, sc, n, m, ans+"h");
        printMazePath(sr, sc+1, n, m, ans+"v");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePath(1,1,n,m,"");
    }
    
}

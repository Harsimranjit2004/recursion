package recursion;

import java.util.Scanner;

public class _24_print_maze_jump {
    public static void printMazeJump(int sr, int sc, int n, int m, String ans){
        if(sr==n && sc==m){
            System.out.println(ans);
            return;
        }
        if(sr>n || sc>m){
            return;
        }
        for(int i =1;i<=n-sr;i++){
            printMazeJump(sr+1, sc, n, m, ans+"h"+i);
        }
        for(int i =1;i<=n-sr;i++){
            printMazeJump(sr, sc+1, n, m, ans+"v"+i);
        }
        for(int i =1;i<=n-sr;i++){
            printMazeJump(sr+1, sc+1, n, m, ans+"d"+i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazeJump(1,1,n,m,"");
    }
    
}

package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class _19_get_maze_path_jump {
    public static ArrayList<String> getMazeJump(int sr , int sc, int n , int m){
        if(sr ==n && sc == m){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
      
        ArrayList<String> myres = new ArrayList<>();
    //horizontal moves
        for(int ms = 1 ;ms<=n-sr;ms++){
            ArrayList<String> h_paths = getMazeJump(sr+ms, sc, n, m);
                for(String h1:h_paths){
                    myres.add("h" + ms+h1);   
                }
            }
        for(int ms = 1 ;ms<=m-sc;ms++){
            ArrayList<String> v_paths = getMazeJump(sr, sc+ms, n, m);
                for(String h1:v_paths){
                    myres.add("v" +ms+h1);   
                }
        }
        //diagonal
        for(int ms = 1 ;ms<=n-sr && ms <= m-sc;ms++){
            ArrayList<String> d_paths = getMazeJump(sr+ms, sc+ms, n, m);
                for(String h1:d_paths){
                    myres.add("d" +ms+h1);   
                }
        }
        return myres;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> res = getMazeJump(1,1,n,m);
        System.out.println(res);
    }
    
}

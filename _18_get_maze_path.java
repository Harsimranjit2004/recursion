package recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class _18_get_maze_path {
    public static ArrayList<String> getmazepath(int sr,int sc, int n, int m ){
        if(sr ==n && sc == m){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sr>n || sc >m){
            ArrayList<String> bres = new ArrayList<>();
            
            return bres;
        }
        ArrayList<String> h1 = getmazepath(sr+1, sc, n, m);
        ArrayList<String> c1 = getmazepath(sr, sc+1, n, m);

        ArrayList<String> myres = new ArrayList<>();

        for(String h_value :h1){
            myres.add(h_value + "h");
        }
        for(String v_value:c1){
            myres.add(v_value+'v');
        }
        return myres;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();

        ArrayList<String> res = getmazepath(1,1,n,m);
        System.out.println(res);
    }
    
}

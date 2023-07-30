package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class _17_get_stair_path {
    public static ArrayList<String> getPath(int n){
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> p1 = getPath(n-1);
        ArrayList<String> p2 = getPath(n-2);
        ArrayList<String> p3 = getPath(n-3);
        ArrayList<String> paths = new ArrayList<>();
       for(String path :p1){
            paths.add(1+path);
       }
       for(String path :p2){
        paths.add(2+path);
        }
        for(String path :p3){
            paths.add(3+path);
       }
       return paths;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = getPath(n);
        System.out.println(res);
    }
}

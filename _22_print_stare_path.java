package recursion;

import java.util.Scanner;

public class _22_print_stare_path {
    public static void printStarePath(int ques, String ans){
        if(ques==0){
            System.out.println(ans);
            return;
        }
        if(ques<0){
            return;
        }
        
        printStarePath(ques-1, ans +"1");
        printStarePath(ques-2, ans +"2");
        printStarePath(ques-3, ans +"3");
    }
    
    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        printStarePath(n,"");
    }
    
}

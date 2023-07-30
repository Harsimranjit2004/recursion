package recursion;

import java.util.Scanner;

public class _25_print_permutation {
    public static void printPerm(String p , String ans){
        if(p.length() ==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<p.length();i++){
            char ch  = p.charAt(i);
            String lques = p.substring(0, i);
            String rques = p.substring(i+1);
            String roq = lques+rques;
            printPerm(roq, ans+ch);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        printPerm(p,"");
    }
    
}

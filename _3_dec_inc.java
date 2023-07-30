package recursion;

import java.util.Scanner;

public class _3_dec_inc {
    public static void decInc(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        decInc(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decInc(n);
    }
    
}

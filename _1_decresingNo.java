package recursion;

import java.util.Scanner;

public class _1_decresingNo {
    public static void printDecresing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecresing(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecresing(n);
    }
}

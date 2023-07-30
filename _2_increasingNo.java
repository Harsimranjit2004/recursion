package recursion;

import java.util.Scanner;

public class _2_increasingNo {
    public static void printIncreasing(int n ){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
    
}

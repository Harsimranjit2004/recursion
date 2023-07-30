package recursion;

import java.util.Scanner;

public class _10_display_reverse {
    public static void displayRev(int[] arr , int n){
        if(n==arr.length){
            return;
        }
        displayRev(arr, n+1);
        System.out.println(arr[n]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1]  = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        displayRev(arr, 0);
    }
    
}

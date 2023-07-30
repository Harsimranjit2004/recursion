package recursion;

import java.util.Scanner;

public class _14_all_indes {
    public static int[] allIndex(int[] arr , int no, int n,int found){
        if(n == arr.length){
            return new int[found];
        }
        if(arr[n] == no){
            int iarr[] = allIndex(arr, no, n+1, found+1);
            iarr[found] = n;
            return iarr;
        }
        else{
            int iarr[] = allIndex(arr, no, n+1, found);
            return iarr;
        }
       
      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1]  = 20;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 30;
        int[] abc = allIndex(arr,20,0,0);
        for(int i = 0 ; i<abc.length ; i++){
            System.out.println(abc[i]);
        }
    }
}

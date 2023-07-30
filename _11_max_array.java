package recursion;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class _11_max_array {
    public static int maxOfArray(int[] arr ,int n){
        if(n==arr.length-1){
            return arr[n];
        }

        int max1 = maxOfArray(arr, n+1);
        int max = arr[n];
        if(max1 >max){
            max = max1;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1]  = 20;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;
        int rw = maxOfArray(arr,0);
        System.out.println(rw);
    }
}

package recursion;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class _12_first_index {
    public static int firstOcc(int[] arr, int no,int n){
        if(n==arr.length-1){
            return -1;
        }
        if(arr[n] == no){
            return n;
        }
        else{

            int fn1 = firstOcc(arr, no,n+1);
            return fn1;
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
        int rw = firstOcc(arr,30,0);
        System.out.println(rw);
    }
    
}

package recursion;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class _13_last_index {
    public static int lastIndex(int[] arr, int no, int n){
        if(n == arr.length){
            return -1;
        }
        int lisa = lastIndex(arr, no, n+1);
        if(lisa == -1){
            if(arr[n] == no){
                return n;
            }else{
                return -1;
            }
           
        }
        else{
            return lisa;
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
        int rw = lastIndex(arr,20,0);
        System.out.println(rw);
    }
    
}

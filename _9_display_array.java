package recursion;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class _9_display_array {
    public static void displayArr(int[] arr, int l){
        int l1 = arr.length;
        if(l==l1){
            return;
        }
        System.out.println(arr[l]);
        displayArr(arr, l+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1]  = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        displayArr(arr, 0);
    }
    
}

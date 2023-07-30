package recursion;

import java.util.Scanner;


import javax.swing.filechooser.FileNameExtensionFilter;

public class _8_fibbo {
    public static int fibbo(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return fibbo(n-1) +fibbo(n-2);
        }
        
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            int res = fibbo(i);
            System.out.println(res);
        }
    }
    
}

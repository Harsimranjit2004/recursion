package recursion;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class _4_fictorial {
    public static int factorial(int n ){
        if(n==1){
            return 1;
        }
        int  fn1 = factorial(n-1);
        int fn = n*fn1;
        return fn;
       
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    
}

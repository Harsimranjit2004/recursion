package recursion;

import java.rmi.server.RemoteRef;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class _5_power {
    public static int power(int n ,  int x){
        if(n==0){
            return 1;
        }
        int pn1 = power(n-1,x);
        int pn = x*pn1;

        return pn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int x = sc.nextInt();
        int res = power(n,x);
        System.out.println(res);
    }
}

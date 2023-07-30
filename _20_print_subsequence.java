package recursion;

import java.util.Scanner;

public class _20_print_subsequence {
    public static void 
    printss(String ques, String ans){
        if(ques.length() ==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printss(roq, ans+"");
        printss(roq,ans+ch);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        printss(str,"");
    }
}

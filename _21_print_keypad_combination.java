package recursion;

import java.util.Scanner;

public class _21_print_keypad_combination {
    public static void printPC(String ques,String ans){
        if(ques.length() ==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeForCh = codes[ch -'0'];
        for(int i = 0;i<codeForCh.length();i++){
            char option = codeForCh.charAt(i);
            printPC(roq, ans+option);
        }
    }
    static String[] codes = {"?!", "abc", "def", "ghi", "jkl","mnop", "qrst","uv", "wxyz",".;"};
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPC(str,"");
    }
    
}

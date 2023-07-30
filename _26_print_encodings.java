package recursion;

import java.util.Scanner;

public class _26_print_encodings {
    public static void printEncoding(String ques, String ans){
        for(int i = 0;i<ques.length();i++){
            if(ques.length()==0){
                System.out.println(ans);
                return;
            }
            else if(ques.length() ==1){
                char ch = ques.charAt(0);
                if(ch=='0'){
                    return;
                }
                else{
                    int chv = ch -'0';

                    ans = ans +codes[chv];
                    System.out.println(ans);
                }
            }
            else{
                char ch = ques.charAt(0);
                String roq = ques.substring(1);
                if(ch=='0'){
                    return;
                }
                else{
                    int chv = ch -'0';

                    ans = ans +codes[chv];
                    printEncoding(roq, ans);
                }
                String ch12 = ques.substring(0,2);
                String roq1 = ques.substring(2);
                int ch12v  = Integer.parseInt(ch12);
                if(ch12v<=26){
                    ans  = ans+codes[ch12v];
                    printEncoding(roq1, ans);
                }


            }
            
        }
    }   
    static String[] codes = {"a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ques  = sc.next();
        printEncoding(ques,"");
    }
    
}

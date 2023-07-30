package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class _16_get_keypad_combination {
    public static ArrayList<String> getCombi(String no){
        if(no.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char first = no.charAt(0);
        
        String rest = no.substring(1);
        ArrayList<String> rres = getCombi(rest);// 6 words of 73
        ArrayList<String> myres = new ArrayList<>();
        String codeforch = codes[first-'0'];
        for(int i =0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String rstr: rres){
                myres.add(chcode+rstr);
            }
        }
   
        

        return myres;
    }
    static String[] codes = {"?!", "abc", "def", "ghi", "jkl","mnop", "qrst","uv", "wxyz",".;"}; // global
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String no  = sc.next();
    

         ArrayList<String> res = getCombi(no);
         System.out.println(res);
    }
    
}

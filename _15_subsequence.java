package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class _15_subsequence {
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch  = str.charAt(0);
        String ros = str.substring(1); //bc
        ArrayList<String> rres = gss(ros);
        ArrayList<String> myres = new ArrayList<>();
        for(String val:rres){
            myres.add(""+val);
            myres.add(ch+val);
        }
        return myres;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str); 
        System.out.println(res);
    }
}

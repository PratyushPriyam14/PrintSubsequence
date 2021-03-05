import java.util.*;
import java.io.*;

public class PrintSubsequence {
    public static void main (String [] args)throws Exception{
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printSubSeq(str,"");
    }
    public static void printSubSeq(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);  //abc ->a
        String restofString=ques.substring(1);  //abc->bc
        printSubSeq(restofString,ans+ch); //jab yes hoga toh
        printSubSeq(restofString,ans+"");//jab  no hoga toh
    }
}

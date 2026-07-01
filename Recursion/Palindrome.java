import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean rec(int left,int right,String s){
        if(left>right){
            return true;
        }
        return s.charAt(left)==s.charAt(right) && rec(left+1,right-1,s);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s="abcddcba";
	    int n=s.length();
	    System.out.print(rec(0,n-1,s));
	}
}

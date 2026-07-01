import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int n;
    static int[] res,org;
    public static void rec(int i){
        if(i>=n){
            return;
        }
        res[i]=org[n-1-i];
        rec(i+1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = {1, 2, 3, 4, 5};
	    org=arr;
	    n=arr.length;
	    res=new int[n];
	    rec(0);
	    for(int i:res)
	    System.out.print(i+" ");
	}
}

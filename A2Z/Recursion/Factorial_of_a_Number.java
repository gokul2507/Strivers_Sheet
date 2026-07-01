import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long rec(int n){
        if(n<=1){
            return 1;
        }
        return rec(n-1)*n;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println(rec(5));
	}
}

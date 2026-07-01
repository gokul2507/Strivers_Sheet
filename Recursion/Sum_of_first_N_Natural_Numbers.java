import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int rec(int n){
        if(n<=0){
            return 0;
        }
        return rec(n-1)+n;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    System.out.println(rec(10));
	}
}

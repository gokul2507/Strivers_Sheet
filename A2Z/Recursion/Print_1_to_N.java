import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void rec(int n){
        if(n<=0){
            return;
        }
        rec(n-1);
        System.out.print(n+" ");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    rec(10);
	}
}

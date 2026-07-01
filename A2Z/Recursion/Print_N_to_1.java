import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void rec(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        rec(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    rec(10);
	}
}

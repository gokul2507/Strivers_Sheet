import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=153;
		int dup=n,res=0;
		while(n>0){
		    res+=(n%10)*(n%10)*(n%10);
		    n/=10;
		}
		System.out.println(dup==res);
	}
}

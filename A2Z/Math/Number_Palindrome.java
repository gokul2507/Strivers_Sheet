import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=1230450,res=0;
		int x=n;
		while(n>0){
		    res*=10;
		    res+=n%10;
		    n/=10;
		}
		System.out.println(res==x);
	}
}

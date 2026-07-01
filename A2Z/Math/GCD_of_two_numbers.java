import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1=20,n2=15;
		for(int i=Math.min(n1,n2)/2;i>0;i--){
		    if(n1%i==0 || n2%i==0){
		        System.out.println(i);
		        break;
		    }
		}
	}
}

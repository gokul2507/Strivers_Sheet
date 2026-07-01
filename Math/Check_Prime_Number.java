import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=1483,c=0;
		for(int i=1;i*i<=n;i++){
		    if(n%i==0){
		        c++;
		        if(i!=n/i){
		            c++;
		        }
		        if(c>2){
		            System.out.println("Not a prime");
		            return;
		        }
		    }
		}
		System.out.println("Prime");
	}
}

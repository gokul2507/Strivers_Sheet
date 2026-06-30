import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=20,i=1,j=1;
		while(i<=n){
		    for(int k=0;k<j && i<=n;k++)
		        System.out.print(i++ + " ");
		    j++;
		    System.out.println();
		}
	}
}

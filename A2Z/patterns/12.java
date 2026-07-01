import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=1;i<n;i++){
		    for(int j=0;j<i;j++)
		        System.out.print(j+1);
		    for(int j=0;j<((n-1-i)*2);j++)
		        System.out.print(" ");
		    for(int j=i;j>0;j--)
		        System.out.print(j);
		    System.out.println();
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=9;
		for(int i=n;i>=1;i=i-2){
		    for(int j=0;j<(n-i)/2;j++)
		        System.out.print(" ");
		    for(int j=0;j<i;j++)
		        System.out.print("*");
		    for(int j=0;j<(n-i)/2;j++)
		        System.out.print(" ");
		    System.out.println();
		}

	}
}

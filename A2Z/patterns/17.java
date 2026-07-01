import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=4;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i-1;j++)
		        System.out.print(" ");
		    for(int j=0;j<=i;j++)
		        System.out.print((char)('A'+j));
		    for(int j=1;j<=i;j++)
		        System.out.print((char)('A'+i-j));
		    System.out.println();
		}
	}
}

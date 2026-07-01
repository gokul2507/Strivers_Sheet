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
		        System.out.print("*");
		    System.out.println();
		}
        for(int i=n;i>=1;i--){
		    for(int j=0;j<i;j++)
		        System.out.print("*");
		    System.out.println();
		}
	}
}

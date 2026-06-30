import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=0;i<n;i++){
		    for(int j=i;j>=0;j--){
		        System.out.print((char)('A'+n-1-j)+" ");
		    }
		    System.out.println();
		}
	}
}

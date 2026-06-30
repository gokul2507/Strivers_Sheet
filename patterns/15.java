import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<=i;j++){
		        System.out.print((char)('A'+j));
		    }
		    System.out.println();
		}
	}
}

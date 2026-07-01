import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<i;j++){
		        System.out.print(n-j);
		    }
		    for(int j=i;j<n+n-1-i;j++){
		        System.out.print(n-i);
		    }
		    for(int j=i-1;j>=0;j--){
		        System.out.print(n-j);
		    }
		    System.out.println();
		}
		for(int i=n-2;i>=0;i--){
		    for(int j=0;j<i;j++){
		        System.out.print(n-j);
		    }
		    for(int j=i;j<n+n-1-i;j++){
		        System.out.print(n-i);
		    }
		    for(int j=i-1;j>=0;j--){
		        System.out.print(n-j);
		    }
		    System.out.println();
		}
	}
}

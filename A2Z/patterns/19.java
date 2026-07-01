import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i;j++){
		        System.out.print("*");
		    }
		    for(int j=0;j<i*2;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<n-i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<n-i;j++){
		        System.out.print("*");
		    }
		    for(int j=0;j<i*2;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<n-i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

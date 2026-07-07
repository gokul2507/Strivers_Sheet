import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int[] arr = {2, 5, 1, 3, 0};
		 int n=arr.length,res=arr[0];
		 for(int i=1;i<n;i++){
		     res=Math.max(res,arr[i]);
		 }
		 System.out.println(res);
	}
}

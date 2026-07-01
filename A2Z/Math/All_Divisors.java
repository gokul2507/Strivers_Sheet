import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=36;
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=1;i*i<n;i++){
		    if(n%i==0){
		        res.add(i);
		        if(i!=n/i){
		            res.add(n/i);
		        }
		    }
		}
		System.out.println(res);
	}
}

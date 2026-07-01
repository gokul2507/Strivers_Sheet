import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
   
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = {10, 5, 10, 15, 10, 5};
	    HashMap<Integer,Integer> count=new HashMap<>();
	    for(int i:arr){
	        count.put(i,count.getOrDefault(i,0)+1);
	    }
	    for (Integer key : count.keySet()) {
	        System.out.println(key+" => "+count.get(key));
	    }
	}
}

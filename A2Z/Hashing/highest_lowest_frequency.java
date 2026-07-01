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
	    int minCount=-1,maxCount=-1,minKey=0,maxKey=0;
	    for (Integer key : count.keySet()) {
	        int freq=count.get(key);
	        if(minCount==-1 || minCount>freq || (minCount==freq && minKey>key)){
	            minCount=freq;
	            minKey=key;
	        }
	        if(maxCount==-1 || maxCount<freq || (maxCount==freq && maxKey<key)){
	            maxCount=freq;
	            maxKey=key;
	        }
	    }
	    System.out.println("Max:"+maxKey+"->"+maxCount);
	    System.out.println("Min:"+minKey+"->"+minCount);
	}
}

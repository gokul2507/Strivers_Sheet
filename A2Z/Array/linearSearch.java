import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int search(int[] nums,int k){
	    for(int i=0,l=nums.length;i<l;i++) if(nums[i]==k) return i;
	    return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int nums[] = {1, 2, 3, 4, 5};
	    System.out.println(search(nums,4));
	    
	}
}

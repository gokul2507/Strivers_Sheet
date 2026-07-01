import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void rec(int pre,int cur,int n){
        if(n<=0){
            return;
        }
        System.out.print(pre+cur+" ");
        rec(cur,pre+cur,n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    rec(-1,1,10);
	}
}

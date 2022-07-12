/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int factorial(int n)
    {
        int p=1;
        while(n>0)
        {
            p=p*n;n-=1;
        }
        return p;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int i;
		    for(i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();System.out.println();
		    }
		   
		    for(i=0;i<n;i++)
		    {
		        System.out.println(factorial(a[i]));
		    }
		} catch(Exception e) {
		    return;
		}
	}
}

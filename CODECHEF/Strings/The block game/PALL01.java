/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int num = sc.nextInt();
		    int temp = num;
		    int rev=0;
		    while(num > 0){
		        rev = rev *10 + num%10;
		        num /= 10;
		    }
		    
		    if(temp == rev ){
		        System.out.println("wins");
		    }
		    else
		    System.out.println("loses");
		}
	        
	    } catch(Exception e) { return;
	    }
	
	}
}

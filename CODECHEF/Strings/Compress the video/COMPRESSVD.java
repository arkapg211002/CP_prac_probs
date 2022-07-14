/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = n;
		    int arr[] = new int[n];
		    for (int i=0;i<n ;i++ ){
		        arr[i] = sc.nextInt();
		    } 
		    if (n==1){
		        System.out.println(n);
		    } 
		    else if (n>1){
		        for (int i = 0;i<n-1 ;i++ ){
		       
		                if (arr[i]==arr[i+1]){
		                    k--;
		                } 

		        }
		        System.out.println(k);
		    } 
		}
	}
}

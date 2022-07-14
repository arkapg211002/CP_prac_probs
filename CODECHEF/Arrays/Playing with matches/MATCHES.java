/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		int n=sc.nextInt();int o[]=new int[n];
		int m[]={6,2,5,5,4,5,6,3,7,6};
		int i;
		for(i=0;i<n;i++)
		{
		    o[i]=0;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=a+b;
		    while(c>0)
		    {
		        o[i]+=m[c%10];
		        c/=10;
		    }
		    System.out.println();
		}
		for(i=0;i<n;i++)
		{
		    System.out.println(o[i]);
		}
	}
}

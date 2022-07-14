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
		int n=sc.nextInt();String a[]=new String[n];
		int i;
		for(i=0;i<n;i++)
		{
		    int p=sc.nextInt();
		    String s=sc.next();
		    if(s.length()!=p)return;
		    if((s.indexOf("5")>=0 && s.indexOf("5")<s.length()) || (s.indexOf("0")>0 && s.indexOf("0")<s.length()))a[i]="YES";
		    else a[i]="NO";
		    System.out.println();
		}
		for(i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
	}
}

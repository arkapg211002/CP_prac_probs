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
    public static int count(List<Integer> l,int n)
    {
        int i=0,c=0;;
        while(i<l.size())
        {
            if(l.get(i)==n)c+=1;
            i+=1;
        }
        return c;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		    int p=sc.nextInt();
		    List<Integer> l= new ArrayList<Integer>();
		    while(p>0)
		    {
		        l.add(sc.nextInt());
		        p--;
		    }
		    int max=0;
		    for(int j=0;j<l.size();j++)
		    {
		        int m=count(l,l.get(j));
		        if(m>=max)max=m;
		    }
		    a[i]=l.size()-max;
		    l.clear();
		    System.out.println();
		}
		for(i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
	}
}

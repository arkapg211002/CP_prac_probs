import java.util.*;
import java.lang.*;
import java.io.*;
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        int p[]=new int[n];
        int i,c;
        for(i=0;i<n;i++)
        {
            c=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            while(a<=b)
            {
                if(a%10==2 || a%10==3 || a%10==9)
                {
                    c+=1;
                }a+=1;
            }
            p[i]=c;
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(p[i]);
        }
    }
}